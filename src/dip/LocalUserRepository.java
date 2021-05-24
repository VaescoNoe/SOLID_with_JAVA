package dip;

public class LocalUserRepository implements UserRepository {

	@Override
	public User getUser(int id) {
		return new User(1, "Noah", "noah@a.com");
	}

}
