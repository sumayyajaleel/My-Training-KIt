package abstraction;

public class ImageSearch extends Google {

	@Override
	public void search() {
		System.out.println("Go to Images");
		
	}
	public static void main(String[] args) {
		ImageSearch obj=new ImageSearch();
		obj.Hello();
		obj.search();

	}

}
