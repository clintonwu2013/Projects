package model.POJO;
// Generated 2019�~5��13�� �U��12:01:30 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Member generated by hbm2java
 */
@Entity
@Table(name = "member", schema = "dbo", catalog = "final")
public class Member implements java.io.Serializable {

	private String email;
	private String mname;
	private String mid;
	private Date bdate;
	private String password;
	private String gender;
	private String location;
	private String phone;
	private String identify;
	private String permission;
	private Integer vcount;
	private Date vtime;
	private Date registerTime;
	private byte[] photo;
	private Set<Mail> mailsForEmail1 = new HashSet<Mail>(0);
	private Set<Mail> mailsForEmail2 = new HashSet<Mail>(0);
	private Set<Report> reportsForReportedEmail = new HashSet<Report>(0);
	private Set<ViolateRecord> violateRecords = new HashSet<ViolateRecord>(0);
	private Set<ActivityMessage> activityMessages = new HashSet<ActivityMessage>(0);
	private Set<Friend> friendsForEmail1 = new HashSet<Friend>(0);
	private Set<Report> reportsForReportEmail = new HashSet<Report>(0);
	private Set<Attendant> attendants = new HashSet<Attendant>(0);
	private Set<Chat> chatsForEmail1 = new HashSet<Chat>(0);
	private Set<Calender> calenders = new HashSet<Calender>(0);
	private Set<Chat> chatsForEmail2 = new HashSet<Chat>(0);
	private Set<Friend> friendsForEmail2 = new HashSet<Friend>(0);
	private Set<Activity> activities = new HashSet<Activity>(0);

	public Member() {
	}

	public Member(String email) {
		this.email = email;
	}

	public Member(String email, String mname, String mid, Date bdate, String password, String gender, String location,
			String phone, String identify, String permission, Integer vcount, Date vtime, Date registerTime,
			byte[] photo, Set<Mail> mailsForEmail1, Set<Mail> mailsForEmail2, Set<Report> reportsForReportedEmail,
			Set<ViolateRecord> violateRecords, Set<ActivityMessage> activityMessages, Set<Friend> friendsForEmail1,
			Set<Report> reportsForReportEmail, Set<Attendant> attendants, Set<Chat> chatsForEmail1,
			Set<Calender> calenders, Set<Chat> chatsForEmail2, Set<Friend> friendsForEmail2, Set<Activity> activities) {
		this.email = email;
		this.mname = mname;
		this.mid = mid;
		this.bdate = bdate;
		this.password = password;
		this.gender = gender;
		this.location = location;
		this.phone = phone;
		this.identify = identify;
		this.permission = permission;
		this.vcount = vcount;
		this.vtime = vtime;
		this.registerTime = registerTime;
		this.photo = photo;
		this.mailsForEmail1 = mailsForEmail1;
		this.mailsForEmail2 = mailsForEmail2;
		this.reportsForReportedEmail = reportsForReportedEmail;
		this.violateRecords = violateRecords;
		this.activityMessages = activityMessages;
		this.friendsForEmail1 = friendsForEmail1;
		this.reportsForReportEmail = reportsForReportEmail;
		this.attendants = attendants;
		this.chatsForEmail1 = chatsForEmail1;
		this.calenders = calenders;
		this.chatsForEmail2 = chatsForEmail2;
		this.friendsForEmail2 = friendsForEmail2;
		this.activities = activities;
	}

	@Id

	@Column(name = "email", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mName", length = 20)
	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Column(name = "mId", length = 10)
	public String getMid() {
		return this.mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bdate", length = 23)
	public Date getBdate() {
		return this.bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Column(name = "password", length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "location", length = 50)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "identify", length = 10)
	public String getIdentify() {
		return this.identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@Column(name = "permission", length = 10)
	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Column(name = "vCount")
	public Integer getVcount() {
		return this.vcount;
	}

	public void setVcount(Integer vcount) {
		this.vcount = vcount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "vTime", length = 23)
	public Date getVtime() {
		return this.vtime;
	}

	public void setVtime(Date vtime) {
		this.vtime = vtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "registerTime", length = 23)
	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name = "photo")
	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail1")
	public Set<Mail> getMailsForEmail1() {
		return this.mailsForEmail1;
	}

	public void setMailsForEmail1(Set<Mail> mailsForEmail1) {
		this.mailsForEmail1 = mailsForEmail1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail2")
	public Set<Mail> getMailsForEmail2() {
		return this.mailsForEmail2;
	}

	public void setMailsForEmail2(Set<Mail> mailsForEmail2) {
		this.mailsForEmail2 = mailsForEmail2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByReportedEmail")
	public Set<Report> getReportsForReportedEmail() {
		return this.reportsForReportedEmail;
	}

	public void setReportsForReportedEmail(Set<Report> reportsForReportedEmail) {
		this.reportsForReportedEmail = reportsForReportedEmail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	public Set<ViolateRecord> getViolateRecords() {
		return this.violateRecords;
	}

	public void setViolateRecords(Set<ViolateRecord> violateRecords) {
		this.violateRecords = violateRecords;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	public Set<ActivityMessage> getActivityMessages() {
		return this.activityMessages;
	}

	public void setActivityMessages(Set<ActivityMessage> activityMessages) {
		this.activityMessages = activityMessages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail1")
	public Set<Friend> getFriendsForEmail1() {
		return this.friendsForEmail1;
	}

	public void setFriendsForEmail1(Set<Friend> friendsForEmail1) {
		this.friendsForEmail1 = friendsForEmail1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByReportEmail")
	public Set<Report> getReportsForReportEmail() {
		return this.reportsForReportEmail;
	}

	public void setReportsForReportEmail(Set<Report> reportsForReportEmail) {
		this.reportsForReportEmail = reportsForReportEmail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Attendant> getAttendants() {
		return this.attendants;
	}

	public void setAttendants(Set<Attendant> attendants) {
		this.attendants = attendants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail1")
	public Set<Chat> getChatsForEmail1() {
		return this.chatsForEmail1;
	}

	public void setChatsForEmail1(Set<Chat> chatsForEmail1) {
		this.chatsForEmail1 = chatsForEmail1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Calender> getCalenders() {
		return this.calenders;
	}

	public void setCalenders(Set<Calender> calenders) {
		this.calenders = calenders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail2")
	public Set<Chat> getChatsForEmail2() {
		return this.chatsForEmail2;
	}

	public void setChatsForEmail2(Set<Chat> chatsForEmail2) {
		this.chatsForEmail2 = chatsForEmail2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberByEmail2")
	public Set<Friend> getFriendsForEmail2() {
		return this.friendsForEmail2;
	}

	public void setFriendsForEmail2(Set<Friend> friendsForEmail2) {
		this.friendsForEmail2 = friendsForEmail2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	public Set<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
