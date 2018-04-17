package model;

import java.util.Map;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import view.BillingView;

public class Billing implements Constants {
	
	BillingView bill;
	SelectedArea selectedArea;
	double totalCost=0.0;
	int fCount =0, iCount =0;
	
	public Billing(BillingView b,SelectedArea s) {		
		bill = b;
		selectedArea = s;		
	}
	
	public String caluculateBill()
	{
		fCount =0 ;
		iCount =0;
		Map<String,SelectedArea> area = selectedArea.getSelectedMap();
		
		
		for(Map.Entry<String,SelectedArea> map:area.entrySet())
		{
			SelectedArea temp = map.getValue();
			if(temp.areaType.isInstalled())
			{
				if(temp.intrusionSensor.isInstalled() && temp.fireSensor.isInstalled())
				{
					totalCost +=INTRUSION_INST + FIRE_INST -60.0;
					totalCost +=INTRUSION_SENSOR_INST + FIRE_SENSOR_INST;
					fCount++;
					iCount++;
				}
				else if(temp.intrusionSensor.isInstalled())
				{
					totalCost += INTRUSION_INST;
					totalCost +=INTRUSION_SENSOR_INST;
					iCount++;
				}
				else if(temp.fireSensor.isInstalled())
				{
					totalCost += FIRE_INST;
					totalCost += FIRE_SENSOR_INST;
					fCount++;
				}
			}
		}
		
		totalCost += GloabalVariables.fDetected * FIRE_DETECT;
		totalCost += GloabalVariables.iDetected * INTRUSION_DETECT;
		
		System.out.println(GloabalVariables.homeG.getAddress() + "address");
		System.out.println(GloabalVariables.homeG.getContactNumber1() + "Phone");
		System.out.println("Total cost"+ totalCost);
		
		
		String billingInfo=	"Customer information \n" + 
				"----------------------------------------------------------------\n"+
				" *Effective dates (of coverage) "+ "06/01/2017 to 06/30/2017" + "\n"+ 
				" *Service Contract Id "+ "SF1965" + "\n" +
				" *Customer name " + GloabalVariables.homeG.getName() +  "\n" +
				" *Address of the property " +GloabalVariables.homeG.getAddress() + " \n " + 
				" *Contact Number1 " + GloabalVariables.homeG.getContactNumber1()  + "\n " + 
				" *Contact Number2 " + GloabalVariables.homeG.getContactNumber2() +"\n " + 
				" *Customer Phone Number " + GloabalVariables.homeG.getCustomerPhoneNumber()+" \n" +
				"-----------------------------------------------------------------\n"+
			    "Intrusion Detection\n" + 
				" *Pricing details \n " + 
				" *Initial Installation service charge: $200 \n" +
				" *Sensor installation $50 per sensor: " +iCount +"\n" +
				" *An extra $20 is charged every time an alarm results in a call to the service" + GloabalVariables.iDetected +"\n" +
				///" *Total cost* \n " +
				"------------------------------------------------------------------\n"+
				"Fire Detection\n" + 
				" *Pricing details \n " + 
				" *Initial Installation service charge: $300 \n" +
				" *Sensor installation $100 per sensor:" + fCount + "\n" +
				" *An extra $50 is charged every time an alarm results in a call to the service"+ GloabalVariables.fDetected +"\n" +
				"--------------------------------------------------------------------\n"+
				" *Total cost" + totalCost + "\n" ;
		
		return billingInfo;
	}

}
