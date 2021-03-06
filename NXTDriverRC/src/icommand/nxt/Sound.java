package icommand.nxt;

import icommand.nxt.comm.NXTCommand;

// TODO: Auto-generated Javadoc
/**
 * Sound class. Usage: SoundSensor.playTone(500, 1000);
 * 
 * @author <a href="mailto:bbagnall@mts.net">Brian Bagnall</a>
 * @version 0.1 10-August-2006
 */
public class Sound {

  /** The Constant nxtCommand. */
  private static final NXTCommand nxtCommand = NXTCommand.getSingleton();

  // Make sure no one tries to instantiate this.
  /**
   * Instantiates a new sound.
   */
  private Sound() {
  }

  /**
   * Play tone.
   *
   * @param frequency the frequency
   * @param duration the duration
   * @return the int
   */
  public static int playTone(int frequency, int duration) {
    return nxtCommand.playTone(frequency, duration);
  }

  /**
   * Plays a sound file from the NXT. SoundSensor files use the .rso extension. The filename is not
   * case sensitive. Filenames on the NXT Bricks display do now show the filename extension.
   * 
   * @param fileName
   *          e.g. "Woops.rso"
   * @param repeat
   *          true = repeat, false = play once.
   * @return If you receive a non-zero number, the filename is probably wrong or the file is not
   *         uploaded to the NXT brick.
   */
  public static byte playSoundFile(String fileName, boolean repeat) {
    return nxtCommand.playSoundFile(fileName, repeat);
  }

  /**
   * Plays a sound file once from the NXT. SoundSensor files use the .rso extension. The filename is
   * not case sensitive. Filenames on the NXT Bricks display do now show the filename extension.
   * 
   * @param fileName
   *          e.g. "Woops.rso"
   * @return If you receive a non-zero number, the filename is probably wrong or the file is not
   *         uploaded to the NXT brick.
   */
  public static byte playSoundFile(String fileName) {
    return Sound.playSoundFile(fileName, false);
  }

  /**
   * Stops a sound file that has been playing/repeating.
   * 
   * @return Error code.
   */
  public static int stopSoundPlayback() {
    return nxtCommand.stopSoundPlayback();
  }
}
