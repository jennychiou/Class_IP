public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageTransfer imageTransfer = new ImageTransfer();
		
		float small_gamma =0.9f, big_gamma = 2.0f; 
		float rate = 0.95f;
		int filter_size = 3;
		
		String fileName = "test.jpg";
		String gray_base = "gray.jpg";
		String small_gamma_base = "gamma" + small_gamma +".jpg";
		String big_gamma_base = "gamma" + big_gamma +".jpg";
		String contrase_base = "contrast.jpg";
		String laplacian_base = "laplacian.jpg";
		
		
		imageTransfer.gray(fileName); //�Ƕ�gray
		
		imageTransfer.neg(gray_base); //�t��negative
		
		imageTransfer.setGamma(gray_base, small_gamma); //gamma�p
		
		imageTransfer.setGamma(gray_base, big_gamma); //gamma�j
		
		imageTransfer.setBinary(big_gamma_base); //�G�Ȥ�binarization
		
		imageTransfer.setSaltAndPepper(small_gamma_base, rate);  //�J���Q���Tsalt
		
		imageTransfer.filter("median", "SaltAndPepper.jpg", filter_size); //�����o�i��median
		
		imageTransfer.setFlatter(gray_base); //���constrast
		
		imageTransfer.laplacian(contrase_base); //�Դ��Դ���t����laplacian
		
		imageTransfer.filter("max",laplacian_base,filter_size); //�̤j���o�i��max
	}

}
