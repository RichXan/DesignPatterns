package Game;

public abstract class IGame {

    abstract void initialize();

    abstract void startplay();

    abstract void endplay();

    public final void play() {
        //��ʼ����Ϸ
        initialize();
   
        //��ʼ��Ϸ
        startplay();
   
        //������Ϸ
        endplay();
    };

}
