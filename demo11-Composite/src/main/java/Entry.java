public abstract class Entry {
    public Entry parent;

    public abstract String getName();
    public abstract int getSize();
    protected Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {
        printList("", 0);
    }
    public void printList(String prefix) {
        printList(prefix, 0);
    }
    protected abstract void printList(String prefix, int indent);

    public String toString() {
        return getName() + " [" + getSize() + "]";
    }

    public Entry getParent() {
        return parent;
    }

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    public String getAbsolutePath() {
         if (getParent() == null) {
            return "/" + getName();
        }
        return getParent().getAbsolutePath() + "/" + getName();
    }
}
