
public class BMI_calculation {
	
	String mName0;
	double mHeight = 0;
	double mWeight = 0;
	double mBMI = 0;
	String mHantei ="";
	
	public BMI_calculation(String name ,double height,double weight) {
		mName0=name;
		mHeight=height;
		mWeight=weight;
		
		checkBMI();
		System.out.println(mName0 +":" + mHantei);
	};
	
	public void checkBMI() {
		mBMI = mWeight / (mHeight * mHeight);
		if (mBMI < 18.5) {
			mHantei="やせ型";
		}else if(mBMI >24) {
			mHantei="肥満型";
		}else {
			mHantei ="標準体形";
		}
	}
	

}