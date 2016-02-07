package com.zzm.nio.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/*
 * @Description Nio��������
 * @Author zhanmin.zheng
 * @CreateDate 2016/02/08
 * @Version 1.0
 */
public class Server {
	
	private final int BLOCK_SIZE = 4096;//��������С
	
	private ByteBuffer sendBuffer = ByteBuffer.allocate(BLOCK_SIZE);//���ͻ�����
	
	private ByteBuffer receiveBuffer = ByteBuffer.allocate(BLOCK_SIZE);//���ܻ�����
	
	private Selector selector;//ѡ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();//�����channel����
			serverSocketChannel.configureBlocking(false);//����Ϊ�Ƕ���״̬
			ServerSocket serverSocket = serverSocketChannel.socket();//����˻�ȡsocket
			serverSocket.bind(endpoint);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * @Description construct method
	 * @param
	 * int 
	 */
	public Server(int port) {
		
	}
}
