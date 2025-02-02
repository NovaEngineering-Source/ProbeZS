package youyihj.probezs;

import net.minecraftforge.common.config.Config;

/**
 * @author youyihj
 */
@Config(modid = ProbeZS.MODID)
public class ProbeZSConfig {

    @Config.Comment("whether output dzs files")
    public static boolean dumpDZS = true;

    @Config.Comment("whether output json files")
    public static boolean dumpJson = false;

    @Config.Comment("Communication port with language server")
    public static int socketPort = 6489;

    @Config.Comment("Communication protocol with language server")
    public static SocketProtocol socketProtocol = SocketProtocol.RPC;

    @Config.Comment("The way to collect zenscript libs")
    public static MemberCollector memberCollector = MemberCollector.REFLECTION;

    public enum SocketProtocol {
        NONE,
        WEBSOCKET,
        RPC
    }

    public enum MemberCollector {
        REFLECTION,
        ASM;
    }
}
