package esp.application.tabbeddevices;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import esp.application.panels.EspStatusPanel;
import esp.application.statusobject.ESPDeviceVO;
import esp.application.utils.PanelConstants;

public class TabbedDevicesPanel extends JPanel
{
	JTabbedPane tabbedPane;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public TabbedDevicesPanel()
	{
		setupPanel();
	}
	
	private void setupPanel() 
	{
		super.setLayout(new GridBagLayout());
		this.setMinimumSize(new Dimension(PanelConstants.TABBED_DEVICE_AREA_X, PanelConstants.TABBED_DEVICE_AREA_Y));
		this.setPreferredSize(new Dimension(PanelConstants.TABBED_DEVICE_AREA_X, PanelConstants.TABBED_DEVICE_AREA_Y));
		
		tabbedPane = new JTabbedPane();
		tabbedPane.setBorder(new LineBorder(Color.black, 1));
		tabbedPane.setMinimumSize(new Dimension(PanelConstants.TABBED_DEVICE_AREA_X, PanelConstants.TABBED_DEVICE_AREA_Y));
		tabbedPane.setPreferredSize(new Dimension(PanelConstants.TABBED_DEVICE_AREA_X, PanelConstants.TABBED_DEVICE_AREA_Y));
		
		
		ESPDeviceVO device = new ESPDeviceVO();
		device.setDeviceName("Testing");
	    addNewDevice(device);

	    gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(tabbedPane, gbc);
	}
    
	
	public void addNewDevice(ESPDeviceVO device)
	{
		EspStatusPanel newDevice = new EspStatusPanel(device);
		
		tabbedPane.addTab(device.getDeviceName(), newDevice);
	}
}
