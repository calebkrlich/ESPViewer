package esp.application.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import esp.application.statusobject.ESPDeviceVO;

public class ESPDeviceStatusPanel extends JPanel
{
	ESPDeviceVO espDevice;
	
	JLabel deviceName;
	
	JLabel macAddr;
	
	JLabel ipAddr;
	
	JLabel deviceVersion;
	
	JLabel firmwareVersion;
	
	GridBagConstraints gbc;
	
	public ESPDeviceStatusPanel(ESPDeviceVO device)
	{
		setupDevicePanel();
	}
	
	public void updatePanel(ESPDeviceVO device)
	{
		deviceName.setText(device.getDeviceName());
		macAddr.setText(device.getDeviceMacAddr());
		ipAddr.setText(device.getDeviceIPAddr());
		deviceVersion.setText(device.getDeviceVersion());
		firmwareVersion.setText(device.getDeviceFirmwareVersion());
	}
	
	private void setupDevicePanel()
	{
		this.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		
		JLabel deviceNameTitle = new JLabel("Device Name: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(deviceNameTitle, gbc);
		
		JLabel macAddrTitle = new JLabel("Mac Address: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(macAddrTitle, gbc);
		
		JLabel ipAddrTitle = new JLabel("IP Address: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(ipAddrTitle, gbc);
	    	
		JLabel deviceVersionTitle = new JLabel("Device Version: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(deviceVersionTitle, gbc);
		
		JLabel firmwareVersionTitle = new JLabel("Firmware Version: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(firmwareVersionTitle, gbc);
		
		deviceName = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(deviceName, gbc);
		
	    macAddr = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(macAddr, gbc);
	    
	    ipAddr = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 2;
		this.add(ipAddr, gbc);
	    
	    deviceVersion = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 3;
		this.add(deviceVersion, gbc);
		
	    firmwareVersion = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 4;
		this.add(firmwareVersion, gbc);
	}
}
