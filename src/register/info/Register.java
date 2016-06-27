package register.info;

public class Register {
	String name="";			//姓名
	String number="";		//学号
	String major="";		//专业
	String ascription="";	//学院
	String apartment="";	//部门
	String sex="";			//性别
	String phone="";		//电话
	String email="";		//邮箱
	String message="";		//个人简介
	String bakcNews="";		//提示信息
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return this.number;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return this.major;
	}
	public void setAscription(String ascription){
		this.ascription=ascription;
	}
	public String getAscription(){
		return this.ascription;
	}
	public void setApartment(String apartment){
		this.apartment=apartment;
	}
	public String getApartment(){
		return this.apartment;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public String getMessage(){
		return this.message;
	}
	public void setBackNews(String backNews){
		this.bakcNews=backNews;
	}
	public String getBackNews(){
		return this.bakcNews;
	}
}
