package interfaces;

public interface MemoryManage {
    final int MEMORY_SIZE = 10;

    void addInMemory(String remembrance);

    String[] getAllMemory();
}
