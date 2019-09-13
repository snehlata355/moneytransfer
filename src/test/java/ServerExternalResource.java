import org.junit.rules.ExternalResource;

public class ServerExternalResource extends ExternalResource {
    @Override
    protected void before() throws Exception {
        Main.initServer();
        Main.server.start();
    }

    @Override
    protected void after()  {
        if (Main.server.isRunning()) {
            try {
                Main.server.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

