package PathOperationExamples;

public class PathOperationExample {

	public static void main(String[] args) {
		/*
		 * Key	Meaning:
			"file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
			"java.class.path"	Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
			"java.home"			nstallation directory for Java Runtime Environment (JRE)
			"java.vendor"		JRE vendor name
			"java.vendor.url"	JRE vendor URL
			"java.version"		JRE version number
			"line.separator"	Sequence used by operating system to separate lines in text files
			"os.arch"			Operating system architecture
			"os.name"			Operating system name
			"os.version"		Operating system version
			"path.separator"	Path separator character used in java.class.path
			"user.dir"			User working directory
			"user.home"			User home directory
			"user.name"			User account name
		 */
		// System.out.println(System.getenv());
		System.out.println(System.getProperty("user.home"));
		
		/*
		 * Parameters:
		 * key: 	the name of the system property.
		 * def: 	a default value.
		 * Returns: the string value of the system property, or the default value if there is no property with that key.
		 */
		System.out.println(System.getProperty("dadir", "dadir property does not exist"));
		

	}

}
