package playing.kolade.com.aninterface;

public class Boxer implements Fighting {

    @Override
    public String throwJab() {
        return "Throw Crazy Jab";
    }

    @Override
    public String throwCross() {
        return "Throw faster jab";
    }

    @Override
    public String throwHook() {
        return null;
    }

    @Override
    public String throwUppercut() {
        return null;
    }
}
