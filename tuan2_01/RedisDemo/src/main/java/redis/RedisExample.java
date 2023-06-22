package redis;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.redisson.Redisson;
import org.redisson.api.RQueue;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisExample {
	public static void main(String[] args) {
		// Tạo Redisson client
		Config config = new Config();
		config.useSingleServer().setAddress("redis://localhost:6379");
		RedissonClient redisson = Redisson.create(config);
		// Lấy đối tượng RedissonQueue để làm việc với hàng đợi
		RQueue<String> queue = redisson.getQueue("messageQueue");
		// Đẩy tin nhắn vào hàng đợi
		queue.offer("Hello lan 4");
		int messageCount = queue.size();
		// Lấy tin nhắn từ hàng đợi
		List<String> message = queue.readAll();

		for (String s : message) {
			System.out.println("Received message: " + s);
		}
		// Đóng kết nối Redisson
		redisson.shutdown();
	}
}
