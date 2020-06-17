package esp.application.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import esp.application.panels.DeviceSelectionPanel;
import esp.application.panels.EspStatusPanel;
import esp.application.statusobject.ESPDeviceVO;
import esp.application.tabbeddevices.TabbedDevicesPanel;
import esp.application.websocket.WebsocketConnection;

import java.awt.Insets;
import java.util.Observable;

import javax.swing.JComboBox;

@SuppressWarnings("deprecation")
public class Application extends Observable
{
	JFrame mainApplicationFrame = new JFrame();
	
	EspStatusPanel devicePanel;
	ESPDeviceVO deviceVO = new ESPDeviceVO();
	DeviceSelectionPanel selectionPanel;
	TabbedDevicesPanel tabbedDevicesPanel;
	
	GridBagConstraints gbc = new GridBagConstraints();
	WebsocketConnection wsc = new WebsocketConnection(9090);
	
	public Application()
	{
		
		Thread websocketThread = new Thread(wsc);
		
		//websocketThread.run();
		setupFrameBasics();
	}
	
	
	private void setupFrameBasics()
	{
		mainApplicationFrame.setTitle("ESP Viewer");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{1.0};
		mainApplicationFrame.getContentPane().setLayout(gridBagLayout);
		mainApplicationFrame.setSize(1000,600);
		mainApplicationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainApplicationFrame.setVisible(true);
		//gbc.insets = new Insets(0, 0, 0, 0);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		tabbedDevicesPanel = new TabbedDevicesPanel();
		mainApplicationFrame.add(tabbedDevicesPanel, gbc);
		//devicePanel = new EspStatusPanel(deviceVO);
		//mainApplicationFrame.add(devicePanel, gbc);
		//mainApplicationFrame.getContentPane().add(devicePanel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		selectionPanel = new DeviceSelectionPanel();
		mainApplicationFrame.add(selectionPanel, gbc);
		//mainApplicationFrame.getContentPane().add(selectionPanel, gbc);
		
		mainApplicationFrame.pack();
		
	}
}
