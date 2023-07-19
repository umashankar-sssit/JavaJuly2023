package encapsulationdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Switch fanSwitch = new Switch();
		fanSwitch.setLabel("Fan");
		fanSwitch.currentState();
		fanSwitch.press();
		//fanSwitch.press();
		fanSwitch.currentState();

		
		Switch lightSwitch = new Switch();
		lightSwitch.setLabel("Light");
		lightSwitch.currentState();
		lightSwitch.press();
		lightSwitch.press();
		lightSwitch.currentState();

	}

}
