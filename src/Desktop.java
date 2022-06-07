
public class Desktop implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("Software Resources:Operating System,Hidden Markove Models,Cloud Computing");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources:CPU,Printer,Memory,Screen network,Windows System,Disk");
	}
	private void desktopModel() {
		System.out.println("Desktop Model:Lenovo");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	}

}
