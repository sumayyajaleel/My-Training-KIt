package abstraction;

public class VideoSearch extends Google {

	@Override
	public void search() {
		System.out.println("Go to Videos");
		
	}
	public static void main(String[] args) {
		VideoSearch obj1=new VideoSearch();
		obj1.Hello();
		obj1.search();

	}

}
