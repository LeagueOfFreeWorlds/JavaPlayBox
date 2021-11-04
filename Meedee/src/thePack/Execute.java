package thePack;
import javax.sound.midi.*;
public class Execute implements ControllerEventListener{
	public static void main(String[] args) {
		Execute exec = new Execute();
		exec.go();
	}
	public void go() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for(int i = 5; i < 75; i+= 4) {
				track.add(makeEvent(144, 1, i, 100, i));
				track.add(makeEvent(176,1,127,0,i));
				track.add(makeEvent(128, 1, i, 100, i + 2));
			} // end loop
			// running sequence:
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		} catch (Exception ex) {ex.printStackTrace();} //close try open catch
	}
	
	public void controlChange(ShortMessage event) {
		System.out.println("suck");
	}
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch(Exception e) {} //close try open catch
		return event; 
	}
}
