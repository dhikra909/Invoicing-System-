package syain;

public class Invoices {

	private String customer_full_name;
	private Integer phone_number;
	private Integer invoice_dat;
	private Integer number_of_items;
	private Integer total_amount;
	private Integer paid_amoun;
	private Integer balanc;
	private Integer Tel;
	private Integer Fax;
	private String  Email;
	private String  Website;
	
	
	public Integer getTel() {
		return Tel;
	}

	public void setTel(Integer tel) {
		Tel = tel;
	}

	public Integer getFax() {
		return Fax;
	}

	public void setFax(Integer fax) {
		Fax = fax;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getCustomer_full_name() {
		return customer_full_name;
	}

	public void setCustomer_full_name(String customer_full_name) {
		this.customer_full_name = customer_full_name;
	}

	public Integer getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}

	public Integer getInvoice_dat() {
		return invoice_dat;
	}

	public void setInvoice_dat(Integer invoice_dat) {
		this.invoice_dat = invoice_dat;
	}

	public Integer getNumber_of_items() {
		return number_of_items;
	}

	public void setNumber_of_items(Integer number_of_items) {
		this.number_of_items = number_of_items;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public Integer getPaid_amoun() {
		return paid_amoun;
	}

	public void setPaid_amoun(Integer paid_amoun) {
		this.paid_amoun = paid_amoun;
	}

	public Integer getBalanc() {
		return balanc;
	}

	public void setBalanc(Integer balanc) {
		this.balanc = balanc;
	}

}
