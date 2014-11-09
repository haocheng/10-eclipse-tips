package tw.idv.haocheng;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tip5 {

	// enable save action in preference
	public interface IAction {
		void action();
	}
	
	public static class SaveAction implements IAction{
		// add missing @Override
		public void action() {
			System.out.println("Save");
		}
		
	}
	
	public static void main(String[] args) {
		
		// format
				new SaveAction().action();
		
	}

}
