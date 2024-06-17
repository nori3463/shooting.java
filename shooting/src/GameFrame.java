import java.util.Vector;

public class GameFrame extends MyFrame{
public void run() {
	GameWorld.player=new Player(100,300,0,0);
		addKeyListener(GameWorld.player);
		GameWorld.playerBullet=new Vector<PlayerBullet>();
		while(true) {
			clear();
			GameWorld.player.draw(this);
			GameWorld.player.move();
			int i=0;
			while(i<GameWorld.playerBullet.size()) {
				PlayerBullet b=GameWorld.playerBullet.get(i);
				b.draw(this);
				b.move();
				if (b.y<0) {
				}else {
					i++;
				}
			}
			sleep(0.03);
		}
	}
}
