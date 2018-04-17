package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class Alarm{

	AudioFormat audioFormat;
	AudioInputStream audioInputStream;
	SourceDataLine sourceDataLine;
	boolean stopPlayback = false;
	//final JButton stopBtn = new JButton("Stop");
	//final JButton playBtn = new JButton("Play");
	//JTextField textField = new JTextField();

//	public static void main(String args[]) {
//		new Alarm();
//	}

	public boolean isStopPlayback() {
		return stopPlayback;
	}

	public void setStopPlayback(boolean stopPlayback) {
		this.stopPlayback = stopPlayback;
	}

	public Alarm() {

//		stopBtn.setEnabled(false);
//		playBtn.setEnabled(true);
//
//		playBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				stopBtn.setEnabled(true);
//				playBtn.setEnabled(false);
//				playAudio();
//			}
//		});
//
//		stopBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				stopPlayback = true;
//			}
//		});
//
//		getContentPane().add(playBtn, "West");
//		getContentPane().add(stopBtn, "East");
//		getContentPane().add(textField, "North");
//
//		setTitle("Copyright 2003, R.G.Baldwin");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(250, 101);
//		setVisible(true);
	}

	public void playAudio() {
		try {
			File soundFile = new File("Alarm.wav");
			audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			audioFormat = audioInputStream.getFormat();
			//System.out.println(audioFormat);

			DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

			sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

			new PlayThread().start();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	class PlayThread extends Thread {
		byte tempBuffer[] = new byte[10000];

		public void run() {
			try {
				sourceDataLine.open(audioFormat);
				sourceDataLine.start();

				int cnt;
				while ((cnt = audioInputStream.read(tempBuffer, 0, tempBuffer.length)) != -1 && stopPlayback == false) {
					if (cnt > 0) {
						sourceDataLine.write(tempBuffer, 0, cnt);
					}
				}
				sourceDataLine.drain();
				sourceDataLine.close();

				//stopBtn.setEnabled(false);
				//playBtn.setEnabled(true);
				stopPlayback = false;
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

}