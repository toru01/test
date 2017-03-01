package jp.techacademy.toru.kikuchi.jumpactiongame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// GameクラスはScreenAdapterクラスと呼ばれる1画面に相当するクラスを設定して簡単に画面遷移を行える機能を持っています。
// そのため今回はGameクラスを継承させます。
public class JumpActionGame extends Game {
	//publicにして外からアクセスできるようにする
	public SpriteBatch batch;

	@Override
	public void create () {
        //また、SpriteBatchクラスは画像をGPUで効率的に描画するためのクラスです。
		batch = new SpriteBatch();

		// GameScreenを表示する
		setScreen(new GameScreen(this));
	}
}
