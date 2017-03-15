package com.hwx.ranger;


public class Resources {

private Path path;

public Path getPath() {
return path;
}

public void setPath(Path path) {
this.path = path;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((path == null) ? 0 : path.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Resources other = (Resources) obj;
	if (path == null) {
		if (other.path != null)
			return false;
	} else if (!path.equals(other.path))
		return false;
	return true;
}

}