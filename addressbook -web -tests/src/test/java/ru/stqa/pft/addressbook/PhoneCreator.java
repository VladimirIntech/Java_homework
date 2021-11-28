package ru.stqa.pft.addressbook;

public class PhoneCreator {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String home;
  private final String mobile;
  private final String work;
  private final String fax;
  private final String email;
  private final String bday;
  private final String bmonth;
  private final String byear;
  private final String address2;
  private final String phone2;
  private final String notes;

  public PhoneCreator(String name, String middlename, String lastname, String nickname, String home, String mobile, String work, String fax, String email, String bday, String bmonth, String byear, String address2, String phone2, String notes) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.home = home;
    this.mobile = mobile;
    this.work = work;
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

  public String getHome() {
    return home;
  }

  public String getMobile() {
    return mobile;
  }

  public String getWork() {
    return work;
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
