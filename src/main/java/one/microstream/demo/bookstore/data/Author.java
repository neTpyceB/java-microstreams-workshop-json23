
package one.microstream.demo.bookstore.data;


public class Author
{
	private final String  name;
	private final Address address;
	
	public Author(
		final String  name,
		final Address address
	)
	{
		super();
		this.name    = name;
		this.address = address;
	}

	public String name()
	{
		return this.name;
	}

	public Address address()
	{
		return this.address;
	}

	@Override
	public String toString()
	{
		return "Author [name=" + this.name + ", address=" + this.address + "]";
	}

}
