package co.edu.collect;

import java.util.HashSet;
import java.util.Set;

public class SetMemberExample {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(10, "홍길동"));
		members.add(new Member(20, "김민수"));
		members.add(new Member(30, "홍길동"));
		members.add(new Member(10, "홍길동"));

		members.clear();

		if (members.isEmpty()) {
			System.out.println("컬렉션이 비어있음.");
		}

		for (Member member : members) {
			System.out.println(member.toString());
		}
	}

}

class Member {
	private int id;
	private String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id: " + id + ", name: " + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;

			return id == mem.getId() && name.equals(mem.getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id; // 동명이인이 있을 수 있으니까 ㅋ
	}

}
