package esp.application.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import esp.application.utils.PanelConstants;

public class DeviceConnectionPanel extends JPanel
{
	JProgressBar connectionProgressBar;
	
	JTextArea connectionLog;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public DeviceConnectionPanel()
	{
		setupPanel();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(new GridBagLayout());
		this.setMinimumSize(new Dimension(PanelConstants.SUB_PANEL_SIZE_X, PanelConstants.SUB_PANEL_SIZE_Y));
		
		this.setBorder(new LineBorder(Color.black, 1));
		
		connectionProgressBar = new JProgressBar();
		connectionProgressBar.setMinimumSize(new Dimension(PanelConstants.SUB_PANEL_SIZE_X, PanelConstants.SUB_PANEL_SIZE_Y/8));
		connectionProgressBar.setPreferredSize(new Dimension(PanelConstants.SUB_PANEL_SIZE_X, PanelConstants.SUB_PANEL_SIZE_Y/8));
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(connectionProgressBar, gbc);
		
		
		connectionLog = new JTextArea("Connection Log");
		connectionLog.setEnabled(false);
		connectionLog.setMinimumSize(new Dimension(PanelConstants.SUB_PANEL_SIZE_X, PanelConstants.SUB_PANEL_SIZE_Y));
		connectionLog.setPreferredSize(new Dimension(PanelConstants.SUB_PANEL_SIZE_X, PanelConstants.SUB_PANEL_SIZE_Y));
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(connectionLog, gbc);
		
	}
}
