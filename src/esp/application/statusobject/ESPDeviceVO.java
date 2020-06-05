package esp.application.statusobject;


/**
 * Contains all the information of esp device connected
 * @author Caleb
 *
 */
public class ESPDeviceVO 
{
	String deviceName;
	
	String deviceMacAddr;
	
	String deviceIPAddr;
	
	String deviceVersion;
	
	String deviceFirmwareVersion;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceMacAddr() {
		return deviceMacAddr;
	}

	public void setDeviceMacAddr(String deviceMacAddr) {
		this.deviceMacAddr = deviceMacAddr;
	}

	public String getDeviceIPAddr() {
		return deviceIPAddr;
	}

	public void setDeviceIPAddr(String deviceIPAddr) {
		this.deviceIPAddr = deviceIPAddr;
	}

	public String getDeviceVersion() {
		return deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getDeviceFirmwareVersion() {
		return deviceFirmwareVersion;
	}

	public void setDeviceFirmwareVersion(String deviceFirmwareVersion) {
		this.deviceFirmwareVersion = deviceFirmwareVersion;
	}

	
}
