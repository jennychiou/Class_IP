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
		
		
		imageTransfer.gray(fileName); //灰階gray
		
		imageTransfer.neg(gray_base); //負片negative
		
		imageTransfer.setGamma(gray_base, small_gamma); //gamma小
		
		imageTransfer.setGamma(gray_base, big_gamma); //gamma大
		
		imageTransfer.setBinary(big_gamma_base); //二值化binarization
		
		imageTransfer.setSaltAndPepper(small_gamma_base, rate);  //胡椒鹽雜訊salt
		
		imageTransfer.filter("median", "SaltAndPepper.jpg", filter_size); //中值濾波器median
		
		imageTransfer.setFlatter(gray_base); //對比constrast
		
		imageTransfer.laplacian(contrase_base); //拉普拉斯邊緣偵測laplacian
		
		imageTransfer.filter("max",laplacian_base,filter_size); //最大值濾波器max
	}

}
