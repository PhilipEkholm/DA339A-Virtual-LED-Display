package common;

import controllers.PxDisplayController;
import controllers.PxInputController;

/**
 * Runs the test environments and the finished program
 * @author Carl Weiwert, Oliver Josefsson, Lucas Borg, Bj�rn Sj�lund, Sebastian Andersson, Hampus Holst, Philip Ekholm
 * @version 1.05
 */

public class Main {
	public static void main(String[] args) {
		new PxDisplayController();
		new PxInputController();
	}
}
