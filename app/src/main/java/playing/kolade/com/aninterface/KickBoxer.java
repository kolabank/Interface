package playing.kolade.com.aninterface;

public class KickBoxer implements Fighting {
    @Override
    public String throwJab() {
        return "Throw Slower Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Harder Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Slower Hook";
    }

    @Override
    public String throwUppercut() {
        return null;
    }
}
