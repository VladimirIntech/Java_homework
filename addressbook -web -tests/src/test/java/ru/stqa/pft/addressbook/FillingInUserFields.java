package ru.stqa.pft.addressbook;

public class FillingInUserFields {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String homePhone;
  private final String mobilePhone;
  private final String workPhone;
  private final String fax;
  private final String email;
  private final String bday;
  private final String bmonth;
  private final String byear;
  private final String address2;
  private final String phone2;
  private final String notes;

  public FillingInUserFields(String name, String middlename, String lastname, String nickname, String homePhone, String mobilePhone, String workPhone, String fax, String email, String bday, String bmonth, String byear, String address2, String phone2, String notes) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
    this.fax = fax;
    this.email = email;
    this.bday = bday;
    this.bmonth = bmonth;
    this.byear = byear;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getBday() {
    return bday;
  }

  public String getBmonth() {
    return bmonth;
  }

  public String getByear() {
    return byear;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }
}
