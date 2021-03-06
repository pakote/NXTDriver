package icommand.nxt;

import icommand.nxt.comm.NXTCommand;
import icommand.nxt.comm.NXTProtocol;

// TODO: Auto-generated Javadoc
/**
 * Battery class. Usage: int x = Battery.getVoltageMilliVolt();
 * 
 * @author <a href="mailto:bbagnall@mts.net">Brian Bagnall</a>
 * @version 0.2 4-September-2006
 * 
 */

public class Battery implements NXTProtocol {

  /** The Constant nxtCommand. */
  private static final NXTCommand nxtCommand = NXTCommand.getSingleton();

  // Ensure no one tries to instantiate this.
  /**
   * Instantiates a new battery.
   */
  private Battery() {
  }

  /**
   * The NXT uses 6 batteries of 1500 mV each.
   * 
   * @return Battery voltage in mV. ~9000 = full.
   */
  public static int getVoltageMilliVolt() {
    /*
     * calculation from LEGO firmware
     */
    int voltage = nxtCommand.getBatteryLevel();
    return voltage;
  }

  /**
   * The NXT uses 6 batteries of 1.5 V each.
   * 
   * @return Battery voltage in Volt. ~9V = full.
   */
  public static float getVoltage() {
    return (float) (getVoltageMilliVolt() * 0.001);
  }
}
