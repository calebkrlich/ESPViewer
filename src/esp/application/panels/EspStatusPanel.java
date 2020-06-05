package esp.application.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import esp.application.statusobject.ESPDeviceIOStatusVO;
import esp.application.statusobject.ESPDeviceVO;

public class EspStatusPanel extends JPanel
{
	ESPDeviceVO device;
	
	ESPDeviceIOStatusVO status;
	
	ESPDeviceStatusPanel deviceOverviewPanel;
	
	ESPIOPanel deviceIOPanel;
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	public EspStatusPanel(ESPDeviceVO device)
	{
		this.device = device;
		
		setupPanels(device);
	}
	
	private void setupOverviewPanel()
	{
		
		/*
		JLabel deviceOverview = new JLabel("ESP DEVICE:");
		constraints.gridx = 0;
		constraints.gridy = 2;
		deviceOverviewPanel.add(deviceOverview, constraints);
		
		JLabel deviceName = new JLabel(device.getDeviceName());
		constraints.gridx = 0;
		constraints.gridy = 0;
		deviceOverviewPanel.add(deviceName, constraints);
	
	
		JLabel deviceIP = new JLabel(device.getDeviceIPAddr());
		constraints.gridx = 0;
		constraints.gridy = 1;
		deviceOverviewPanel.add(deviceIP, constraints);
		*/
	}
	
	private void setupPanels(ESPDeviceVO device)
	{
		this.setMinimumSize(new Dimension(500,600));
		this.setPreferredSize(new Dimension(500,600));
		this.setLayout(new GridBagLayout());
		
		deviceOverviewPanel = new ESPDeviceStatusPanel(device);
		deviceOverviewPanel.setMinimumSize(new Dimension(300,150));
		deviceOverviewPanel.setPreferredSize(new Dimension(300,150));
		
		deviceOverviewPanel.setBorder(new LineBorder(Color.BLACK, 1));
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(deviceOverviewPanel, constraints);
		
		deviceIOPanel = new ESPIOPanel();
		deviceIOPanel.setMinimumSize(new Dimension(300,200));
		deviceIOPanel.setPreferredSize(new Dimension(300,200));
		
		deviceIOPanel.setBorder(new LineBorder(Color.black, 1));
		
		constraints.gridx = 0;
		constraints.gridy = 1; 
		this.add(deviceIOPanel, constraints);
		
		setupOverviewPanel();
		
		this.setVisible(true);
		this.revalidate();
	}
}
