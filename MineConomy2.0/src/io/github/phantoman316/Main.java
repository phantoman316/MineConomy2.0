package io.github.phantoman316;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin {
 
    @Override
    public void onEnable() {
    	File folder = new File("plugins\\MineConomy2.0");
    	if(!folder.exists()){
    		if(folder.mkdir()){
    		    System.out.println("File Created!");
    	    }
    	    else {
    		    System.out.println("File Not Created!");
    	    }
    	}
    	else{
    		System.out.println("Already Created Folder!");
    	}
    	File dba = new File("plugins\\MineConomy2.0\\DBA.txt");
    	if(!dba.exists()){ 
    		try {
				if(dba.createNewFile()){
				    System.out.println("DB Created!");
				}
				else{
					System.out.println("DB Not Created!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	else{
    		System.out.println("DB Already Created!");
    	}
       
    }
   
    @Override
    public void onDisable() {
       
    }
   
    @Override
    public boolean onCommand(CommandSender sender,
            Command command,
            String label,
            String[] args) {
        if (command.getName().equalsIgnoreCase("money")) {
            sender.sendMessage(ChatColor.GREEN + "You ran /money!");
            return true;
        }
        if (command.getName().equalsIgnoreCase("m")){
        	sender.sendMessage(ChatColor.GREEN + "You ran /m!");
        	return true;
        }
        return false;
    }
    
    public void onPlayerJoin(PlayerJoinEvent e){
    	Player player = (Player) e;
    	player.sendMessage("Welcome " + player.getName());
    }
   
}