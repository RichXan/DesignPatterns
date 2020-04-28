package Game;

public abstract class IGame {

    abstract void initialize();

    abstract void startplay();

    abstract void endplay();

    public final void play() {
        //初始化游戏
        initialize();
   
        //开始游戏
        startplay();
   
        //结束游戏
        endplay();
    };

}
