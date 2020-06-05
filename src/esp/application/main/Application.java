package esp.application.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import esp.application.panels.EspStatusPanel;
import esp.application.statusobject.ESPDeviceVO;
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
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	WebsocketConnection wsc = new WebsocketConnection(9090);
	
	public Application()
	{
		
		Thread websocketThread = new Thread(wsc);
		
		websocketThread.run();
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
		gbc.insets = new Insets(0, 0, 0, 5);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		devicePanel = new EspStatusPanel(deviceVO);
		
		mainApplicationFrame.getContentPane().add(devicePanel, gbc);
		mainApplicationFrame.pack();
		
	}
}
