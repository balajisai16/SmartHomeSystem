package controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JComboBox;

import model.Alarm;
import model.Billing;
import model.GloabalVariables;
import model.SelectedArea;
import view.BillingView;
import view.ControlPanelView;
import view.FireDetection;
import view.GraphicalLayout;
import view.IntrusionDetect;


public class ControlPanel {
	
	ControlPanelView view;
	//Schedule schedule;
	SelectedArea selectedArea;
	String selectedToSchedule;
	String selectedToDisabled;
	String selectedDay;
	Date dateFrom , dateTo;
	
	public ControlPanel(ControlPanelView view1 , SelectedArea s) {	
		view = view1;
		//GloabalVariables.viewG = view;
		selectedArea = s;
		GloabalVariables.selectedAreaG = s;
		initController();
	}

	private void initController() {
		
		//Date from12 = (Date)spinner_from.getModel().getValue();
		view.getBtnBack().addActionListener(e->back());
		selectedArea();
		selectedAreaToSchedule();
		selectedAreaDisabled();
		
		scheduleTime();
		disableArea();
		detectFireAndIntrusion();
		detectIntrusion();
		billGenerator();
		viewGraphicalLayout();
		//backGracphicalView();
		disableAll();
	}

	private void disableAll() {
		// TODO Auto-generated method stub
		view.getBtnDisableAllSensors().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				selectedArea.disableAll();
				view.getSelectedComboBox().setModel(selectedArea.selectedList());
				view.getEnabledArea().setModel(selectedArea.selectedList());
				view.getLblStatus().setText("OFF");
				view.getLblStatus().setForeground(Color.red);
			}
		});
	}

	private void detectIntrusion() {
		
		view.getBtnIntrusionDetect().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(selectedArea.onIntrusionDetect(selectedToSchedule))
				{
					
					view.setVisible(false);
			    	Alarm a = new Alarm();
			    	IntrusionDetect id = new IntrusionDetect();
			    	GloabalVariables.container.add(id);
			    	a.playAudio();
			    	GloabalVariables.iDetected++;
			    	id.getLblPhonenumber().setText(GloabalVariables.homeG.getContactNumber1());
			    	
			    	id.getTxtResponseCode().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							responseCode = id.getTxtResponseCode().getText();
						}
					});
			    	
			    	id.getBtnEnter().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(id.getTxtResponseCode().getText().equals("1234"))
							{
								a.setStopPlayback(true);
								id.setVisible(false);
								view.setVisible(true);
								System.out.println("enter");
							}
							
						}
					});
					
				}
				
				
			}
		});
		
		
	}



	GraphicalLayout gView1;
	
	private void viewGraphicalLayout() {
		
		view.getBtnGraphicalLayout().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gView1 = new GraphicalLayout();
				GloabalVariables.container.add(gView1);
				GraphicViewController gModel = new GraphicViewController(gView1, selectedArea ,view);
				GloabalVariables.gContG = gModel;
				gModel.showActiveSensors();
			}
		});
		
	}
	
	

	private void billGenerator() {
		
		view.getBtnBillGenrator().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BillingView bView = new BillingView();
				view.setVisible(false);
				GloabalVariables.container.add(bView);
				Billing billing = new Billing(bView, selectedArea);				
				String cost = billing.caluculateBill();
				bView.getTextAreaBill().setText(cost);
				
				bView.getBtnBack().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						view.setVisible(true);
						bView.setVisible(false);
					}
				});
			}
		});
		
		
		
	}
	String responseCode="";
	private void detectFireAndIntrusion() {
		// TODO Auto-generated method stub
		view.getBtnFireDetect().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					//Toolkit.getDefaultToolkit().beep();
				    if(selectedArea.onFireDetected(selectedToSchedule))
				    {
				    	//OnDetected d = new OnDetected();
				    	view.setVisible(false);
				    	Alarm a = new Alarm();
				    	FireDetection fd = new FireDetection();
				    	GloabalVariables.container.add(fd);
				    	a.playAudio();
				    	GloabalVariables.fDetected++;
				    	fd.getLblPhonenumber().setText(GloabalVariables.homeG.getContactNumber1());
				    	fd.getTxtEnter().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								responseCode = fd.getTxtEnter().getText();
							}
						});
				    	fd.getBtnEnter().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if(fd.getTxtEnter().getText().equals("1234"))
								{
									a.setStopPlayback(true);
									fd.setVisible(false);
									view.setVisible(true);
									System.out.println("enter");
								}
								
							}
						});
				    }
					
			}
		});
		
		view.getBtnIntrusionDetect().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				selectedArea.onIntrusionDetect(selectedToSchedule);
			}
		});
	}

	private void disableArea() {
		
		view.getBtnDisable().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedArea.onDisableSensor(selectedToDisabled);
				view.getSelectedComboBox().setModel(selectedArea.selectedList());
				view.getEnabledArea().setModel(selectedArea.selectedList());
			}
		});
		
	}

	private void scheduleTime() {
		
		view.getBtnSchedule().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dateFrom = (Date) view.getSpinner_from().getModel().getValue();
//				date.getHours();
//				date.getMinutes();
				dateTo = (Date) view.getSpinner_to().getModel().getValue();
				System.out.println(dateFrom.getMinutes());			
				selectedArea.onScheduleClicked(selectedToSchedule, dateFrom, dateTo);
				
			}
		});
		
		
		
	}

	

	private void selectedAreaDisabled() {
		
		view.getEnabledArea().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox cb = (JComboBox) e.getSource();
				selectedToDisabled = (String) cb.getSelectedItem();
				System.out.println("selected " + selectedToDisabled);
				
			}
		});		
	}

	private void selectedAreaToSchedule() {
		
///view.getSelectedComboBox().setSelectedIndex(0);
		
		view.getSelectedComboBox().addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				JComboBox cb = (JComboBox) e.getSource();
				selectedToSchedule = (String) cb.getSelectedItem();
				GloabalVariables.selectedSchedule = selectedToSchedule;
				System.out.println("selected " + selectedToSchedule);			
			}
		});
		
		
	}

	private void selectedArea() {
		
		view.getSelectedComboBox().setModel(selectedArea.selectedList());
		view.getEnabledArea().setModel(selectedArea.selectedList());
		
		if(selectedArea.selectedList().getSize() > 0)
		{
			view.getLblStatus().setText("ON");
			view.getLblStatus().setForeground(Color.GREEN);
		}
		else
		{
			view.getLblStatus().setText("OFF");
			view.getLblStatus().setForeground(Color.RED);
		}
		
	}

	private void back() {
		
		view.setVisible(false);
		GloabalVariables.configPanelG.setVisible(true);
		
	}
	
	

}
