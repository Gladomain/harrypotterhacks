# harrypotterhacks
A series of fun and/or practical Harry Potter-based applications. (Created for Allison Seiden as part of the WiCS 2017 Secret Santa exchange.)

## shortcut spells
Terminal commands (aliases), based on Harry Potter spells. Rather than using `mdfind` (or a similar search function, if you're not a Mac OS X user), locate your files with
```
accio "keep off the dirigible plums"
```
and view your past Terminal commands with
```
priorincantato
```
### Set-Up
Note that the following installation instructions are written with Mac users in mind:

The content of [.aliases](shortcut-spells/.aliases) can be directly copied/pasted into your laptop's bash profile (open `~/.bash_profile` with your favorite text editor). Afterwards, refresh with the command
```
. ~/.bash_profile
```
To activate `hpspells`, which prints a quick reference list of the Harry Potter spell aliases (with definitions), add [hpspells](shortcut-spells/hpspells) to your laptop's bin folder (located at `/bin`) (note: you may have to use `sudo` or `alohomora`/`chmod +x`). Then the command
```
hpspells
```
should print said reference list:
```
accio [text]		summons files containing [text]
alohomora [file]	unlocks read/write/execute permissions for [file]
geminio [old] [new]	duplicates [old] and saves it as [new]
nox			puts laptop in sleep mode (thus extinguishing light)
obliviate		clears Terminal screen (thus erasing current memory)
priorincantato		reveals the most recent Terminal commands performed
revelio			reveals concealed files in directory
silencio		mutes laptop volume
sonorus			amplifies laptop volume to max level
```

## hp quotes
Prints a random quote from the Harry Potter series (by first choosing a book, then selecting a quote). The quote generator can be run using
```
./run.sh
```

## arithmancy calculator
Uses name arithmancy to compute people's character, heart, and social numbers. The calculator can be run using
```
./run.sh
```
Note: currently in progress