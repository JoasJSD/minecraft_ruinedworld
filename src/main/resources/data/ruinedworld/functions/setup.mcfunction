scoreboard objectives add tr.first dummy
execute unless score %USED tr.first matches 2.. run schedule function ruinedworld:toast 20t
scoreboard players set %USED tr.first 2