package esp.application.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import esp.application.utils.PanelConstants;

public class DeviceSelectionPanel extends JPanel implements ActionListener
{
	JLabel ipAddrLabel;
	JTextField ipAddrField;
	JButton deviceConnectButton;
	
	
	GridBagConstraints gbc;
	
	public DeviceSelectionPanel()
	{
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setMinimumSize(new Dimension(PanelConstants.BASIC_PANEL_SIZE_X, PanelConstants.BASIC_PANEL_SIZE_Y));
		this.setPreferredSize(new Dimension(PanelConstants.BASIC_PANEL_SIZE_X, PanelConstants.BASIC_PANEL_SIZE_Y));
		this.setLayout(new GridBagLayout());
		
		gbc = new GridBagConstraints();
		
		ipAddrLabel = new JLabel("Device IP Addr: ");
		ipAddrLabel.setMinimumSize(new Dimension(125,20));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(ipAddrLabel, gbc);
		
		ipAddrField = new JTextField("");
		ipAddrField.setMinimumSize(new Dimension(125,20));
		ipAddrField.addActionListener(this);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		this.add(ipAddrField, gbc);
		
		deviceConnectButton = new JButton("Connect");
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(deviceConnectButton, gbc);
		
		this.setBorder(new LineBorder(Color.black, 1));
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
