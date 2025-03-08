package multipleinheritence.com;

public class SmartPhone implements Camera,MusicPlayer,Phone {

	@Override
	public void makeCall(String number) {
		// TODO Auto-generated method stub
		System.out.println("Calling "+number +" from Smartphone");
		
	}

	@Override
	public void endCall() {
		// TODO Auto-generated method stub
		System.out.println("Ending call on SmartPhone");
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music in SmartPhone");
		
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("Stopping music in SmartPhone");
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Taking Photo from Smartphone");
		
	}

	@Override
	public void recordVideo() {
		// TODO Auto-generated method stub
		System.out.println("Recording video from Smartphone");
		
	}
	
}