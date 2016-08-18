package Employee;

public class Employee 
{
	
	private int employee_no;
	private String f_name;
	private String l_name;
	private String o_names;
	private String address;
	private String city;
	private String country;
	private String postcode;
	private String ni_num;
	private double starting_sal;
	private String bankname;
	private String accountnum;
	private String sortcode;
	private String cardname;
	private String iban;
	private String bic;
	
	

	
	public Employee()
	{	
	}
	
	public Employee(String f_name, String l_name, String o_name, String address, String city,
			String country, String postcode, String ni_num, double starting_sal, String bankname,
			String accountnum, String sortcode, String cardname, String iban, String bic)
	{
		this.f_name = f_name;
		this.l_name = l_name;
		this.o_names = o_name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postcode = postcode;
		this.ni_num =ni_num;
		this.starting_sal = starting_sal;
		this.bankname = bankname;
		this.accountnum = accountnum;
		this.sortcode =sortcode;
		this.cardname = cardname;
		this.iban = iban;
		this.bic = bic;
	}
	
	public Employee(int employee_no, String f_name, String l_name, String o_name, String address, String city,
			String country, String postcode, String ni_num, double starting_sal, String bankname,
			String accountnum, String sortcode, String cardname, String iban, String bic)
	{
		this.employee_no = employee_no;
		this.f_name = f_name;
		this.l_name = l_name;
		this.o_names = o_name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postcode = postcode;
		this.ni_num =ni_num;
		this.starting_sal = starting_sal;
		this.bankname = bankname;
		this.accountnum = accountnum;
		this.sortcode =sortcode;
		this.cardname = cardname;
		this.iban = iban;
		this.bic = bic;
	}

	public int getEmployee_no() {
		return employee_no;
	}

	public void setEmployee_no(int employee_no) {
		this.employee_no = employee_no;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getO_names() {
		return o_names;
	}

	public void setO_names(String o_names) {
		this.o_names = o_names;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getNi_num() {
		return ni_num;
	}

	public void setNi_num(String ni_num) {
		this.ni_num = ni_num;
	}

	public double getStarting_sal() {
		return starting_sal;
	}

	public void setStarting_sal(double starting_sal) {
		this.starting_sal = starting_sal;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}

	public String getSortcode() {
		return sortcode;
	}

	public void setSortcode(String sortcode) {
		this.sortcode = sortcode;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}
	
	
	
	
	
	
}
