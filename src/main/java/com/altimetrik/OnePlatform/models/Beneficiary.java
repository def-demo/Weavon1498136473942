package com.altimetrik.OnePlatform.models;


import java.util.Objects;


import org.springframework.data.annotation.Id;





public class Beneficiary  {
  
  
   
   
  
  private String address = null;
  
   
   
  
  private Integer flag = null;
  
   
   
  
  private String city = null;
  
   
   
  
  private String clientname = null;
  
   
   
  
  private Integer mmid = null;
  
   
   
  
  private String accountnumber = null;
  
   
   
  
  private Integer relationshipid = null;
  
   
   
  
  private Integer customid = null;
  
   
   
  
  private String branch = null;
  
   
   
  
  private String beneficiarymobilenumber = null;
  
   
   
  
  private String remitterid = null;
  
   
   
  
  private String bank = null;
  
   
   
  
  private String bcagent = null;
  
   
   
  
  private String beneficiaryname = null;
  
   
   
  
  private String sessiontoken = null;
  
   
  
  @Id
   
  
  private String id = null;
  
   
   
  
  private String beneficiaryemailid = null;
  
   
   
  
  private String state = null;
  
   
   
  
  private String ifsccode = null;
  
   
   
  
  private String status = null;

  
  /**
   * {}
   **/
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * {}
   **/
  public Integer getFlag() {
    return flag;
  }
  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  
  /**
   * {}
   **/
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * {}
   **/
  public String getClientname() {
    return clientname;
  }
  public void setClientname(String clientname) {
    this.clientname = clientname;
  }

  
  /**
   * {}
   **/
  public Integer getMmid() {
    return mmid;
  }
  public void setMmid(Integer mmid) {
    this.mmid = mmid;
  }

  
  /**
   * {}
   **/
  public String getAccountnumber() {
    return accountnumber;
  }
  public void setAccountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
  }

  
  /**
   * {}
   **/
  public Integer getRelationshipid() {
    return relationshipid;
  }
  public void setRelationshipid(Integer relationshipid) {
    this.relationshipid = relationshipid;
  }

  
  /**
   * {}
   **/
  public Integer getCustomid() {
    return customid;
  }
  public void setCustomid(Integer customid) {
    this.customid = customid;
  }

  
  /**
   * {}
   **/
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

  
  /**
   * {}
   **/
  public String getBeneficiarymobilenumber() {
    return beneficiarymobilenumber;
  }
  public void setBeneficiarymobilenumber(String beneficiarymobilenumber) {
    this.beneficiarymobilenumber = beneficiarymobilenumber;
  }

  
  /**
   * {}
   **/
  public String getRemitterid() {
    return remitterid;
  }
  public void setRemitterid(String remitterid) {
    this.remitterid = remitterid;
  }

  
  /**
   * {}
   **/
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   * {}
   **/
  public String getBcagent() {
    return bcagent;
  }
  public void setBcagent(String bcagent) {
    this.bcagent = bcagent;
  }

  
  /**
   * {}
   **/
  public String getBeneficiaryname() {
    return beneficiaryname;
  }
  public void setBeneficiaryname(String beneficiaryname) {
    this.beneficiaryname = beneficiaryname;
  }

  
  /**
   * {}
   **/
  public String getSessiontoken() {
    return sessiontoken;
  }
  public void setSessiontoken(String sessiontoken) {
    this.sessiontoken = sessiontoken;
  }

  
  /**
   * {"primaryKey":true}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getBeneficiaryemailid() {
    return beneficiaryemailid;
  }
  public void setBeneficiaryemailid(String beneficiaryemailid) {
    this.beneficiaryemailid = beneficiaryemailid;
  }

  
  /**
   * {}
   **/
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * {}
   **/
  public String getIfsccode() {
    return ifsccode;
  }
  public void setIfsccode(String ifsccode) {
    this.ifsccode = ifsccode;
  }

  
  /**
   * {}
   **/
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beneficiary beneficiary = (Beneficiary) o;
    return Objects.equals(address, beneficiary.address) &&
        Objects.equals(flag, beneficiary.flag) &&
        Objects.equals(city, beneficiary.city) &&
        Objects.equals(clientname, beneficiary.clientname) &&
        Objects.equals(mmid, beneficiary.mmid) &&
        Objects.equals(accountnumber, beneficiary.accountnumber) &&
        Objects.equals(relationshipid, beneficiary.relationshipid) &&
        Objects.equals(customid, beneficiary.customid) &&
        Objects.equals(branch, beneficiary.branch) &&
        Objects.equals(beneficiarymobilenumber, beneficiary.beneficiarymobilenumber) &&
        Objects.equals(remitterid, beneficiary.remitterid) &&
        Objects.equals(bank, beneficiary.bank) &&
        Objects.equals(bcagent, beneficiary.bcagent) &&
        Objects.equals(beneficiaryname, beneficiary.beneficiaryname) &&
        Objects.equals(sessiontoken, beneficiary.sessiontoken) &&
        Objects.equals(id, beneficiary.id) &&
        Objects.equals(beneficiaryemailid, beneficiary.beneficiaryemailid) &&
        Objects.equals(state, beneficiary.state) &&
        Objects.equals(ifsccode, beneficiary.ifsccode) &&
        Objects.equals(status, beneficiary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, flag, city, clientname, mmid, accountnumber, relationshipid, customid, branch, beneficiarymobilenumber, remitterid, bank, bcagent, beneficiaryname, sessiontoken, id, beneficiaryemailid, state, ifsccode, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiary {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  flag: ").append(flag).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  clientname: ").append(clientname).append("\n");
    sb.append("  mmid: ").append(mmid).append("\n");
    sb.append("  accountnumber: ").append(accountnumber).append("\n");
    sb.append("  relationshipid: ").append(relationshipid).append("\n");
    sb.append("  customid: ").append(customid).append("\n");
    sb.append("  branch: ").append(branch).append("\n");
    sb.append("  beneficiarymobilenumber: ").append(beneficiarymobilenumber).append("\n");
    sb.append("  remitterid: ").append(remitterid).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  bcagent: ").append(bcagent).append("\n");
    sb.append("  beneficiaryname: ").append(beneficiaryname).append("\n");
    sb.append("  sessiontoken: ").append(sessiontoken).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  beneficiaryemailid: ").append(beneficiaryemailid).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  ifsccode: ").append(ifsccode).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

