public class Midnights {
    //begins in 1, index 0 unused
    String[] lyrics;
    String[] titles;
    String album;
    int tracksNumber;

    public Midnights() {
        tracksNumber = 22;
        lyrics = new String[tracksNumber+1];
        album = "Midnights";
        titles = new String[]{"", "Lavender Haze", "Maroon", "Anti-Hero", "Snow On The Beach", "You're On Your Own, Kid",
                "Midnight Rain", "Question...?", "Vigilante Shit", "Bejeweled", "Labyrinth", "Karma", "Sweet Nothing",
                "Mastermind", "The Great War", "Bigger Than The Whole Sky", "Paris", "High Infidelity", "Glitch",
                "Would've, Could've, Should've", "Dear Reader", "Hits Different", "You're Losing Me"
        };
        lyrics[1] = "Meet me at midnight Staring at the ceiling with you Oh, you don't ever say too much And you don't really read into" +
                "My melancholia I been under scrutiny (Yeah, oh, yeah) You handle it beautifully (Yeah, oh, yeah)" +
                "All this shit is new to me (Yeah, oh, yeah) I feel The lavender haze creeping up on me Surreal" +
                "I'm damned if I do give a damn what people say No deal The 1950s shit they want from me I just wanna stay in that lavender haze" +
                "All they keep asking me (All they keep asking me) Is if I'm gonna be your bride The only kinda girl they see (Only kinda girl they see)" +
                "Is a one-night or a wife I find it dizzying (Yeah, oh, yeah) They're bringing up my history (Yeah, oh, yeah)" +
                "But you weren't even listening (Yeah, oh, yeah) I feel The lavender haze creepin' up on me Surreal" +
                "I'm damned if I do give a damn what people say No deal The 1950s shit they want from me I just wanna stay in that lavender haze" +
                "That lavender haze Talk your talk and go viral I just need this love spiral Get it off your chest" +
                "Get it off my desk (Get it off my desk) Talk your talk and go viral I just need this love spiral" +
                "Get it off your chest Get it off my desk I feel (I feel) The lavender haze creeping up on me Surreal" +
                "I'm damned if I do give a damn what people say No deal (No deal) The 1950s shit they want from me" +
                "I just wanna stay in that lavender haze Get it off your chest Get it off my desk That lavender haze" +
                "I just wanna stay I just wanna stay in that lavender haze ";
        lyrics[2] = "When the morning came We were cleaning incense off your vinyl shelf 'Cause we lost track of time again" +
                "Laughing with my feet in your lap Like you were my closest friend \"How'd we end up on the floor, anyway?\" you say" +
                "\"Your roommate's cheap-ass screw-top rosé, that's how\" I see you every day now And I chose you" +
                "The one I was dancing with In New York, no shoes Looked up at the sky and it was The burgundy on my t-shirt" +
                "When you splashed your wine into me And how the blood rushed into my cheeks So scarlet, it was" +
                "The mark thеy saw on my collarbone The rust that grew bеtween telephones The lips I used to call home" +
                "So scarlet, it was maroon When the silence came We were shaking, blind and hazy How the hell did we lose sight of us again?" +
                "Sobbing with your head in your hands Ain't that the way shit always ends? You were standing hollow-eyed in the hallway" +
                "Carnations you had thought were roses, that's us I feel you, no matter what The rubies that I gave up" +
                "And I lost you The one I was dancing with In New York, no shoes Looked up at the sky and it was (Maroon)" +
                "The burgundy on my t-shirt When you splashed your wine into me And how the blood rushed into my cheeks" +
                "So scarlet, it was (Maroon) The mark they saw on my collarbone The rust that grew between telephones" +
                "The lips I used to call home So scarlet, it was maroon And I wake with your memory over me That's a real fucking legacy, legacy (It was maroon)" +
                "And I wake with your memory over me That's a real fucking legacy to leave The burgundy on my t-shirt" +
                "When you splashed your wine into me And how the blood rushed into my cheeks So scarlet, it was maroon" +
                "The mark they saw on my collarbone The rust that grew between telephones The lips I used to call home" +
                "So scarlet, it was maroon It was maroon It was maroon ";
        lyrics[3] = "I have this thing where I get older, but just never wiser Midnights become my afternoons When my depression works the graveyard shift, all of the people" +
                "I've ghosted stand there in the room I should not be left to my own devices They come with prices and vices" +
                "I end up in crisis (Tale as old as time) I wake up screaming from dreaming One day, I'll watch as you're leaving" +
                "'Cause you got tired of my scheming (For the last time) It's me, hi I'm the problem, it's me At teatime, everybody agrees" +
                "I'll stare directly at the sun, but never in the mirror It must be exhausting always rooting for the anti-hero" +
                "Sometimes, I feel like everybody is a sexy baby And I'm a monster on the hill Too big to hang out, slowly lurching toward your favorite city" +
                "Pierced through the heart, but never killed Did you hear my covert narcissism I disguise as altruism" +
                "Like some kind of congressman? (A tale as old as time) I wake up screaming from dreaming One day, I'll watch as you're leaving" +
                "And life will lose all its meaning (For the last time) It's me, hi I'm the problem, it's me (I'm the problem, it's me)" +
                "At teatime, everybody agrees I'll stare directly at the sun, but never in the mirror It must be exhausting always rooting for the anti-hero" +
                "I have this dream my daughter-in-law kills me for the money She thinks I left them in the will" +
                "The family gathers 'round and reads it and then someone screams out \"She's laughing up at us from Hell\"" +
                "It's me, hi I'm the problem, it's me It's me, hi I'm the problem, it's me It's me, hi Everybody agrees, everybody agrees" +
                "It's me, hi (Hi) I'm the problem, it's me (I'm the problem, it's me) At teatime (Teatime), everybody agrees (Everybody agrees)" +
                "I'll stare directly at the sun, but never in the mirror It must be exhausting always rooting for the anti-hero";
        lyrics[4] = "One night, a few moons ago I saw flecks of what could've been lights But it might just have been you" +
                "Passing by unbeknownst to me Life is emotionally abusive And time can't stop me quite like you did" +
                "And my flight was awful, thanks for asking I'm unglued, thanks to you And it's like snow at the beach" +
                "Weird, but fuckin' beautiful Flying in a dream Stars by the pocketful You wanting me Tonight feels impossible" +
                "But it's comin' down No sound, it's all around Like snow on the beach Like snow on the beach Like snow on the beach" +
                "Like snow, ah This scene feels like what I once saw on a screen I searched \"aurora borealis green\"" +
                "I've never seen someone lit from within Blurring out my periphery My smile is like I won a contest" +
                "And to hide that would be so dishonest And it's fine to fake it 'til you make it 'Til you do, 'til it's true" +
                "Now it's like snow at the beach Weird, but fuckin' beautiful Flying in a dream Stars by the pocketful" +
                "You wanting me Tonight feels impossible But it's comin' down No sound, it's all around Like snow on the beach" +
                "Like snow on the beach Like snow on the beach Like snow, ah I (I) can't (Can't) speak, afraid to jinx it" +
                "I (I) don't (Don't) even dare to wish it But your eyes are flying saucers from another planet" +
                "Now I'm all for you like Janet Can this be a real thing? Can it? Are we falling like snow at the beach? (Snow at the beach)" +
                "Weird, but fuckin' beautiful Flying in a dream (Flying in a dream) Stars by the pocketful You wanting me (You wanting me)" +
                "Tonight feels impossible But it's comin' down No sound, it's all around Like snow on the beach (Snow on the beach)" +
                "Like snow on the beach (Flying in a dream) Like snow on the beach (You wanting me) Like snow, ah" +
                "But it's comin' down No sound, it's all around Like snow on the beach (It's comin' down, it's comin' down)" +
                "(It's comin' down, it's comin' down) Like snow on the beach (It's comin' down, it's comin' down)" +
                "(It's comin' down, it's comin' down) (It's comin' down, it's comin' down) (It's comin' down, it's comin' down)" +
                "(It's comin' down, it's comin' down) (It's comin' down, it's comin' down) ";
        lyrics[5] = "Summer went away, still, the yearning stays I play it cool with the best of them I wait patiently, he's gonna notice me" +
                "It's okay, we're the best of friends Anyway I hear it in your voice, you're smoking with your boys" +
                "I touch my phone as if it's your face I didn't choose this town, I dream of getting out There's just one who could make me stay" +
                "All my days From sprinkler splashes to fireplace ashes I waited ages to see you there I search the party of better bodies" +
                "Just to learn that you never cared You're on your own, kid You always have been I see the great escape, so long, Daisy May" +
                "I picked the petals, he loves me not Something different bloomed, writing in my room I play my songs in the parking lot" +
                "I'll run away From sprinkler splashes to fireplace ashes I called a taxi to take me there I search the party of better bodies" +
                "Just to learn that my dreams aren't rare You're on your own, kid You always have been From sprinkler splashes to fireplace ashes" +
                "I gave my blood, sweat, and tears for this I hosted parties and starved my body Like I'd be saved by a perfect kiss" +
                "The jokes weren't funny, I took the money My friends from home don't know what to say I looked around in a blood-soaked gown" +
                "And I saw something they can't take away 'Cause there were pages turned with the bridges burned" +
                "Everything you lose is a step you take So, make the friendship bracelets, take the moment and taste it" +
                "You've got no reason to be afraid You're on your own, kid Yeah, you can face this You're on your own, kid" +
                "You always have been ";
        lyrics[6] = "Rain He wanted it comfortable, I wanted that pain He wanted a bride, I was making my own name" +
                "Chasing that fame, he stayed the same All of me changed like midnight My town was a wasteland" +
                "Full of cages, full of fences Pageant queens and big pretenders But for some, it was paradise" +
                "My boy was a montage A slow-motion, love potion Jumping off things in the ocean I broke his heart 'cause he was nice" +
                "He was sunshine, I was midnight rain He wanted it comfortable, I wanted that pain He wanted a bride, I was making my own name" +
                "Chasing that fame, he stayed the same All of me changed like midnight It came like a postcard" +
                "Picture perfect shiny family Holiday peppermint candy But for him, it's every day So I peered through a window" +
                "A deep portal, time travel All the love we unravel And the life I gave away 'Cause he was sunshine, I was midnight rain" +
                "He wanted it comfortable, I wanted that pain He wanted a bride, I was making my own name Chasing that fame, he stayed the same" +
                "All of me changed like midnight rain He wanted it comfortable, I wanted that pain He wanted a bride, I was making my own name" +
                "Chasing that fame, he stayed the same All of me changed like midnight I guess sometimes we all get" +
                "Just what we wanted, just what we wanted And he never thinks of me Except for when I'm on TV" +
                "I guess sometimes we all get Some kind of haunted, some kind of haunted And I never think of him" +
                "Except on midnights like this (Midnights like this, midnights like this)[Chorus] He wanted it comfortable, I wanted that pain" +
                "He wanted a bride, I was making my own name Chasing that fame, he stayed the same All of me changed like midnight rain" +
                "He wanted it comfortable, I wanted that pain He wanted a bride, I was making my own name Chasing that fame, he stayed the same" +
                "All of me changed like midnight I guess sometimes we all get Just what we wanted, just what we wanted" +
                "And he never thinks of me Except for when I'm on TV I guess sometimes we all get Some kind of haunted, some kind of haunted" +
                "And I never think of him Except on midnights like this (Midnights like this, midnights like this)";
        lyrics[7] = "I remember Good girl, sad boy Big city, wrong choices We had one thing goin' on I swear that it was somethin'" +
                "'Cause I don't remember who I was Before you painted all my nights A color I've searched for since" +
                "But one thing after another Fuckin' situations, circumstances Miscommunications, and I Have to say, by the way" +
                "I just may like some explanations Can I ask you a question? Did you ever have someone kiss you in a crowded room" +
                "And every single one of your friends was makin' fun of you But fifteen seconds later, thеy were clappin' too?" +
                "Then what did you do? Did you lеave her house in the middle of the night? Oh Did you wish you'd put up more of a fight, oh" +
                "When she said it was too much? Do you wish you could still touch her? It's just a question Half-moon eyes, bad surprise" +
                "Did you realize out of time? She was on your mind with some dickhead guy That you saw that night" +
                "But you were on somethin' It was one drink after another Fuckin' politics and gender roles And you're not sure and I don't know" +
                "Got swept away in the gray I just may like to have a conversation Can I ask you a question? Did you ever have someone kiss you in a crowded room" +
                "And every single one of your friends was makin' fun of you But fifteen seconds later, they were clappin' too?" +
                "Then what did you do? Did you leave her house in the middle of the night? Oh Did you wish you'd put up more of a fight, oh" +
                "When she said it was too much? Do you wish you could still touch her? It's just a question Does it feel like everything's just like" +
                "Second best after that meteor strike? And what's that that I heard? That you're still with her?" +
                "That's nice, I'm sure that's what's suitable And right, but tonight Can I ask you a question? (Can I ask you a question?)" +
                "Did you ever have someone kiss you in a crowded room (In a crowded room) And every single one of your friends was makin' fun of you (Makin' fun of you)" +
                "But fifteen seconds later, they were clappin' too? Then what did you do? (Do) Did you leave her house in the middle of the night? Oh" +
                "Did you wish you'd put up more of a fight, oh (More of a fight) When she said it was too much?" +
                "Do you wish you could still touch her? It's just a question ";
        lyrics[8] = "Draw the cat eye sharp enough to kill a man You did some bad things, but I'm the worst of them" +
                "Sometimes I wonder which one'll be your last lie They say looks can kill and I might try I don't dress for women" +
                "I don't dress for men Lately, I've been dressin' for revenge I don't start shit, but I can tell you how it ends" +
                "Don't get sad, get even So on the weekends I don't dress for friends Lately, I've been dressin' for revenge" +
                "She needed cold, hard proof, so I gave her some She had the envelope, where you think she got it from?" +
                "Now she gets the house, gets the kids, gets the pride Picture me thick as thieves with your ex-wife" +
                "And she looks so pretty Drivin' in your Benz Lately, she's been dressin' for revenge She don't start shit, but she can tell you how it ends" +
                "Don't get sad, get even So on the weekends She don't dress for friends Lately, she's been dressing for revenge" +
                "Ladies always rise above Ladies know what people want Someone sweet and kind and fun The lady simply had enough" +
                "While he was doin' lines and crossin' all of mine Someone told his white-collar crimes to the FBI" +
                "And I don't dress for villains Or for innocents I'm on my vigilante shit again I don't start shit, but I can tell you how it ends" +
                "Don't get sad, get even So on the weekends I don't dress for friends Lately, I've been dressin' for revenge";
        lyrics[9] = "Baby love, I think I've been a little too kind Didn't notice you walkin' all over my peace of mind" +
                "In the shoes I gave you as a present Puttin' someone first only works when you're in their top five" +
                "And by the way, I'm goin' out tonight Best believe I'm still bejeweled When I walk in the room" +
                "I can still make the whole place shimmer And when I meet the band They ask, \"Do you have a man?\"" +
                "I could still say, \"Do you have a man?\" Familiarity breeds contempt Don't put mе in the basement" +
                "Whеn I want the penthouse of your heart Diamonds in my eyes I polish up real, I polish up real nice" +
                "Nice Baby boy, I think I've been too good of a girl (Too good of a girl) Did all the extra credit, then got graded on a curve" +
                "I think it's time to teach some lessons I made you my world (Huh), have you heard? (Huh) I can reclaim the land" +
                "And I miss you (Miss you), but I miss sparklin' (Nice) Best believe I'm still bejeweled When I walk in the room" +
                "I can still make the whole place shimmer And when I meet the band They ask, \"Do you have a man?\"" +
                "I could still say, \"Do you have a man?\" Familiarity breeds contempt Don't put me in the basement" +
                "When I want the penthouse of your heart Diamonds in my eyes I polish up real, I polish up real nice" +
                "Nice Sapphire tears on my face Sadness became my whole sky But some guy said my aura's moonstone" +
                "Just 'cause he was high And we're dancin' all night And you can try to change my mind But you might have to wait in line" +
                "What's a girl gonna do? A diamond's gotta shine Best believe I'm still bejeweled When I walk in the room" +
                "I can still make the whole place shimmer (Shimmer) And when I meet the band They ask, \"Do you have a man?\"" +
                "I could still say, \"Do you have a man?\" Familiarity breeds contempt Don't put me in the basement" +
                "When I want the penthouse of your heart Diamonds in my eyes I polish up real (Nice), I polish up real nice" +
                "And we're dancin' all night And you can try to change my mind But you might have to wait in line" +
                "What's a girl gonna do? What's a girl gonna do? I polish up nice Best believe I'm still bejeweled" +
                "When I walk in the room I can still make the whole place shimmer ";
        lyrics[10] = "\"It only hurts this much right now\" Was what I was thinkin' the whole time Breathe in, breathe through, breathe deep, breathe out" +
                "I'll be gettin' over you my whole life You know how scared I am of elevators Never trust it if it rises fast" +
                "It can't last Uh-oh, I'm fallin' in love Oh no, I'm fallin' in love again Oh, I'm fallin' in love" +
                "I thought the plane was goin' down How'd you turn it right around? It only feels this raw right now" +
                "Lost in the labyrinth of my mind Break up, break free, break through, break down You would break your back to make me break a smile" +
                "You know how much I hate That everybody just expects me to bounce back Just like that Uh-oh, I'm fallin' in love" +
                "Oh no, I'm fallin' in love again Oh, I'm fallin' in love I thought the plane was goin' down How'd you turn it right around?" +
                "Uh-oh, I'm fallin' in love Oh no, I'm fallin' in love again Oh, I'm fallin' in love I thought the plane was goin' down" +
                "How'd you turn it right around? Uh-oh, I'm fallin' in love Oh no, I'm fallin' in love again Oh, I'm fallin' in love" +
                "I thought the plane was goin' down How'd you turn it right around? Uh-oh, I'm fallin' in love" +
                "Oh no, I'm fallin' in love again Oh, I'm fallin' in love I thought the plane was goin' down How'd you turn it right around?";
        lyrics[11] = "Karma is that girl, like (Grrah) You're talking shit for the hell of it Addicted to betrayal, but you're relevant" +
                "You're terrified to look down 'Cause if you dare, you'll see the glare Of everyone you burned just to get there" +
                "It's comin' back around And I keep my side of the street clean You wouldn't know what I mean" +
                "'Cause karma is my boyfriend Karma is a god Karma is the breeze in my hair on the weekend Karma's a relaxing thought" +
                "Aren't you envious that for you it's not? Sweet like honey, karma is a cat Purring in my lap 'cause it loves me" +
                "Flexing likе a goddamn acrobat Me and karma vibe like that Spiderboy, king of thieves Weave your little webs of opacity" +
                "My pennies made your crown Trick me once, trick me twice Don't you know that cash ain't the only price?" +
                "It's coming back around Karma is your chеck's 'boutta bounce (Damn) Karma is a fire in your house (Grrah)" +
                "And she 'boutta pop up unannounced (Like) And she never leavin' you alone (Damn) Watch her put ya opps on a throne (Damn)" +
                "Got you wavin' pretty white flags, feenin' for that cash Thinkin' it'll save ya, now you switchin' up your behavior" +
                "It's okay, baby, you ain't gotta worry, karma never gets lazy So, I keep my head up, my bread up, I won't let up (Never)" +
                "Promise that you'll never endeavor with none lesser (Ever, ever) I be draggin' that wagon, karma is a beauty winning that pageant, grrah" +
                "And I keep my side of the street clean You wouldn't know what I mean 'Cause karma is my boyfriend (Damn)" +
                "Karma is a god Karma is the breeze in my hair on the weekend Karma's a relaxing thought Aren't you envious that for you it's not?" +
                "Sweet like honey, karma is a cat Purring in my lap 'cause it loves me Flexing like a goddamn acrobat" +
                "Me and karma vibe like that (Grrah) Ask me what I learned from all those years Ask me what I earned from all those tears" +
                "Ask me why so many fade, but I'm still here (I'm still here, I'm still here) 'Cause karma is the thunder" +
                "Rattlin' your ground Karma's on your scent like a bounty hunter And karma's gonna track you down" +
                "Step by step, from town to town Sweet like justice, karma is a queen Karma takes all my friends to the summit (Facts)" +
                "Karma is the guy on the screen Coming straight home to me 'Cause karma is my boyfriend (Karma is my boyfriend)" +
                "Karma is a god (Damn) Karma is the breeze in my hair on the weekend (Weekend) Karma's a relaxing thought" +
                "Aren't you envious that for you it's not? Sweet like honey, karma is a cat Purring in my lap 'cause it loves me" +
                "Flexing like a goddamn acrobat Me and karma vibe like that Karma is my boyfriend Karma is a god (Ah)" +
                "Karma is my bestie (Mmm) Karma's a relaxing thought Karma's gonna hold you down ";
        lyrics[12] = "I spy with my little tired eye Tiny as a firefly A pebble that we picked up last July Down deep inside your pocket" +
                "We almost forgot it Does it ever miss Wicklow sometimes? Ooh, ooh They said the end is comin'" +
                "Everyone’s up to somethin' I find myself runnin' home to your sweet nothings Outside, they’re push and shovin'" +
                "You're in the kitchen hummin' All that you ever wanted from me was sweet nothin' On the way home" +
                "I wrote a poem You say, \"What a mind\" This happens all the time Ooh, ooh 'Causе they said the end is comin'" +
                "Evеryone's up to somethin’ I find myself runnin’ home to your sweet nothings Outside, they're push and shovin’" +
                "You're in the kitchen hummin' All that you ever wanted from me was nothin' Industry disruptors and soul deconstructors" +
                "And smooth-talking hucksters out glad-handing each other And the voices that implore, \"You should be doing more\"" +
                "To you, I can admit that I’m just too soft for all of it Ooh They said the end is comin' Everyone's up to somethin'" +
                "I find myself runnin' home to your sweet nothings Outside, they're push and shovin' You're in the kitchen hummin'" +
                "All that you ever wanted from me was sweet nothin' They said the end is comin' (They said the end is comin')" +
                "Everyone's up to somethin' (Everyone's up to somethin') I find myself runnin' home to your sweet nothings" +
                "Outside, they're push and shovin' (Outside, they're push and shovin') You're in the kitchen hummin' (You're in the kitchen hummin')" +
                "All that you ever wanted from me was sweet nothin' ";
        lyrics[13] = "Once upon a time, the planets and the fates And all the stars aligned You and I ended up in the same room" +
                "At the same time And the touch of a hand lit the fuse Of a chain reaction of countermoves To assess the equation of you" +
                "Checkmate, I couldn't lose What if I told you none of it was accidental? And the first night that you saw me" +
                "Nothing was gonna stop me I laid the groundwork, and then Just like clockwork The dominoes cascaded in a line" +
                "What if I told you I'm a mastermind? And now you're mine It was all by dеsign 'Cause I'm a mastermind" +
                "You see, all the wisеst women Had to do it this way 'Cause we were born to be the pawn In every lover's game" +
                "If you fail to plan, you plan to fail Strategy sets the scene for the tale I'm the wind in our free-flowing sails" +
                "And the liquor in our cocktails What if I told you none of it was accidental? And the first night that you saw me" +
                "I knew I wanted your body I laid the groundwork, and then Just like clockwork The dominoes cascaded in a line" +
                "What if I told you I'm a mastermind? And now you're mine It was all my design 'Cause I'm a mastermind" +
                "No one wanted to play with me as a little kid So I've been scheming like a criminal ever since" +
                "To make them love me and make it seem effortless This is the first time I've felt the need to confess" +
                "And I swear I'm only cryptic and Machiavellian 'Cause I care So I told you none of it was accidental" +
                "And the first night that you saw me Nothing was gonna stop me I laid the groundwork, and then" +
                "Saw a wide smirk on your face You knew the entire time You knew that I'm a mastermind And now you're mine" +
                "Yeah, all you did was smile 'Cause I'm a mastermind ";
        lyrics[14] = "My knuckles were bruised like violets Sucker punching walls, cursed you as I sleep-talked Spineless in my tomb of silence" +
                "Tore your banners down, took the battle underground And maybe it was egos swinging Maybe it was her" +
                "Flashes of the battle come back to me in a blur All that bloodshed, crimson clover Uh-huh, sweet dream was over" +
                "My hand was the one you reached for All throughout the Great War Always remember Uh-huh, tears on the lеtter" +
                "I vowed not to cry anymore If wе survived the Great War You drew up some good faith treaties" +
                "I drew curtains closed, drank my poison all alone You said I have to trust more freely But diesel is desire, you were playing with fire" +
                "And maybe it's the past that's talking Screaming from the crypt Telling me to punish you for things you never did" +
                "So I justified it All that bloodshed, crimson clover Uh-huh, the bombs were closer My hand was the one you reached for" +
                "All throughout the Great War Always remember Uh-huh, the burning embers I vowed not to fight anymore" +
                "If we survived the Great War Uh-huh, uh-huh It turned into something bigger Somewhere in the haze, got a sense I'd been betrayed" +
                "Your finger on my hairpin triggers Soldier down on that icy ground Looked up at me with honor and truth" +
                "Broken and blue, so I called off the troops That was the night I nearly lost you I really thought I'd lost you" +
                "We can plant a memory garden Say a solemn prayer, place a poppy in my hair There's no morning glory, it was war, it wasn't fair" +
                "And we will never go back To that bloodshed, crimson clover Uh-huh, the worst was over My hand was the one you reached for" +
                "All throughout the Great War Always remember Uh-huh, we're burned for better I vowed I would always be yours" +
                "'Cause we survived the Great War Uh-huh, uh-huh I will always be yours 'Cause we survived the Great War" +
                "Uh-huh I vow I will always be yours ";
        lyrics[15] = "No words appear before me in the aftermath Salt streams out my eyes and into my ears Every single thing I touch becomes sick with sadness" +
                "'Cause it's all over now, all out to sea Goodbye, goodbye, goodbye You were bigger than the whole sky" +
                "You were more than just a short time And I've got a lot to pine about I've got a lot to live without" +
                "I'm never gonna meet What could've been, would've been What should've been you What could've been, would've been you" +
                "Did some bird flap its wings ovеr in Asia? Did some force take you bеcause I didn't pray? Every single thing to come has turned into ashes" +
                "'Cause it's all over, it's not meant to be So I'll say words I don't believe Goodbye, goodbye, goodbye" +
                "You were bigger than the whole sky You were more than just a short time And I've got a lot to pine about" +
                "I've got a lot to live without I'm never gonna meet What could've been, would've been What should've been you" +
                "What could've been, would've been you What could've been, would've been What should've been you" +
                "What could've been, would've been you (What could've been, would've been you) Goodbye, goodbye, goodbye" +
                "You were bigger than the whole sky You were more than just a short time And I've got a lot to pine about" +
                "I've got a lot to live without I'm never gonna meet What could've been, would've been What should've been you";
        lyrics[16] = "\"Your ex-friend's sister Met someone at a club and he kissed her Turns out, it was that guy you hooked up with ages ago" +
                "Some wannabe Z-lister And all the outfits were terrible 2003 unbearable Did you see the photos?\"" +
                "No, I didn't, but thanks, though I'm so in love that I might stop breathing Drew a map on your bedroom ceiling" +
                "No, I didn't see the news 'Cause we were somewhere else Stumbled down pretend alleyways Cheap wine, make believe it's champagne" +
                "I was taken by the view Like we were in Paris Like we were somewhere else Like we were in Paris, oh" +
                "We were somewhere else Privacy sign on the door And on my page and on the whole world Romance is not dead if you keep it just yours" +
                "Levitate above all the messes made Sit quiet by my side in the shade And not the kind that's thrown" +
                "I mean, the kind under where a tree has grown I'm so in love that I might stop breathing Drew a map on your bedroom ceiling" +
                "No, I didn't see the news 'Cause we were somewhere else Stumbled down pretend alleyways Cheap wine, make believe it's champagne" +
                "I was taken by the view Like we were in Paris, oh Like we were somewhere else Like we were in Paris, oh" +
                "We were somewhere else I wanna brainwash you Into loving me forever I wanna transport you To somewhere the culture's clever" +
                "Confess my truth In swooping, sloping, cursive letters Let the only flashing lights be the tower at midnight" +
                "In my mind We drew a map on your bedroom ceiling No, I didn't see the news 'Cause we were somewhere else" +
                "In an alleyway, drinking champagne 'Cause we were in Paris Yes, we were somewhere else My love, we were in Paris" +
                "Yes, we were somewhere else ";
        lyrics[17] = "Lock broken, slur spoken Wound open, game token I didn't know you were keeping count Rain soaking, blind hoping" +
                "You said I was freeloading I didn't know you were keeping count High infidelity Put on your records and regret me" +
                "I bent the truth too far tonight I was dancing around, dancing around it High infidelity Put on your headphones and burn my city" +
                "Your picket fence is sharp as knives I was dancing around, dancing around it Do you really wanna know where I was April 29th?" +
                "Do I really have to chart the constellations in his eyes? Storm coming, good husband Bad omen" +
                "Dragged my feet right down the aisle At the house lonely, good money I'd pay if you'd just know me" +
                "Seemed like the right thing at the time You know there's many different ways that you can kill the one you love" +
                "The slowest way is never loving them enough Do you really wanna know where I was April 29th?" +
                "Do I really have to tell you how he brought me back to life? High infidelity Put on your records and regret me" +
                "I bent the truth too far tonight I was dancing around, dancing around it High infidelity Put on your headphones and burn my city" +
                "Your picket fence is sharp as knives I was dancing around, dancing around it Do you really want to know where I was April 29th?" +
                "Do I really have to chart the constellations in his eyes? You know there's many different ways that you can kill the one you love" +
                "The slowest way is never loving them enough High infidelity Put on your records and regret meeting me" +
                "I bent the truth too far tonight I was dancing around, dancing around it High infidelity Put on your headphones and burn my city" +
                "Your picket fence is sharp as knives I was dancing around, dancing around it Oh, there's many different ways that you can kill the one you love" +
                "And it's never enough, it's never enough Lock broken, slur spoken Wound open, game token I didn't know you were keeping count" +
                "Rain soaking, blind hoping You said I was freeloading I didn't know you were keeping count But, oh, you were keeping count";
        lyrics[18] = "We were supposed to be just friends You don't live in my part of town, but maybe I'll see you out some weekend" +
                "Depending on what kind of mood and situationship I'm in And what's in my system I think there's been a glitch, oh, yeah" +
                "Five seconds later, I'm fastening myself to you with a stitch, oh, yeah And I'm not even sorry, nights are so starry" +
                "Blood moonlit It must be counterfeit I think there's been a glitch, oh, yeah I was supposed to sweat you out" +
                "In search of glorious happenings of happenstance on someone else's playground But it's been two-thousand one-hundred ninety days of our love blackout" +
                "(Our love is blacking out) The system's breaking down (The system's breaking down) I think there's been a glitch, oh, yeah" +
                "Five seconds later, I'm fastening myself to you with a stitch, oh, yeah And I'm not even sorry, nights are so starry" +
                "Blood moonlit It must be counterfeit I think there's been a glitch A brief interruption, a slight malfunction" +
                "I'd go back to wanting dudes who give nothing I thought we had no chance And that's romance, let's dance" +
                "Glitch, oh, yeah Five seconds later, I'm fastening myself to you with a stitch, oh, yeah And I'm not even sorry, nights are so starry" +
                "Blood moonlit It must be counterfeit (It must be counterfeit) I think there's been a glitch ";
        lyrics[19] = "If you would've blinked, then I would've Looked away at the first glance If you tasted poison, you could've" +
                "Spit me out at the first chance And if I was some paint, did it splatter On a promising grown man?" +
                "And if I was a child, did it matter If you got to wash your hands? Ooh, all I used to do was pray" +
                "Would've, could've, should've If you'd never looked my way I would've stayed on my knees And I damn sure never would've danced with the devil" +
                "At nineteen And the God's honest truth is that the pain was heaven And now that I'm grown, I'm scared of ghosts" +
                "Memories feel like weapons And now that I know, I wish you'd left me wondering If you never touched me, I would've" +
                "Gone along with the righteous If I never blushed, then they could've Never whispered about this" +
                "And if you never saved me from boredom I could've gone on as I was But, Lord, you made me feel important" +
                "And then you tried to erase us Ooh, you're a crisis of my faith Would've, could've, should've" +
                "If I'd only played it safe I would've stayed on my knees And I damn sure never would've danced with the devil" +
                "At nineteen And the God's honest truth is that the pain was heaven And now that I'm grown, I'm scared of ghosts" +
                "Memories feel like weapons And now that I know, I wish you'd left me wondering God rest my soul" +
                "I miss who I used to be The tomb won't close Stained glass windows in my mind I regret you all the time" +
                "I can't let this go I fight with you in my sleep The wound won't close I keep on waiting for a sign" +
                "I regret you all the time If clarity's in death, then why won't this die? Years of tearing down our banners, you and I" +
                "Living for the thrill of hitting you where it hurts Give me back my girlhood, it was mine first" +
                "And I damn sure never would've danced with the devil At nineteen And the God's honest truth is that the pain was heaven" +
                "And now that I'm grown, I'm scared of ghosts Memories feel like weapons And now that I know, I wish you'd left me wondering" +
                "God rest my soul I miss who I used to be The tomb won't close Stained glass windows in my mind" +
                "I regret you all the time I can't let this go I fight with you in my sleep The wound won't close" +
                "I keep on waiting for a sign I regret you all the time Oh, God rest my soul I miss who I used to be" +
                "The tomb won't close Stained glass windows in my mind I regret you all the time I can't let this go" +
                "I fight with you in my sleep The wound won't close I keep on waiting for a sign I regret you all the time";
        lyrics[20] = "Dear reader, if it feels like a trap You're already in one Dear reader, get out your map Pick somewhere and just run" +
                "Dear reader, burn all the files Desert all your past lives And if you don't recognize yourself" +
                "That means you did it right Never take advice from someone who's falling apart Never take advice from someone who's falling apart (You should find another)" +
                "Dear reader, bend when you can Snap when you have to Dear reader, you don't have to answer Just 'cause they asked you" +
                "(You should find another) Dear reader, the greatest of luxuries is your secrets Dear reader, when you aim at the devil" +
                "Make sure you don't miss Never take advice from someone who's falling apart Never take advice from someone who's falling apart" +
                "So I wander through these nights I prefer hiding in plain sight My fourth drink in my hand These desperate prayers of a cursed man" +
                "Spilling out to you for free But darling, darling, please You wouldn't take my word for it if you knew who was talking" +
                "If you knew where I was walking To a house, not a home, all alone 'cause nobody's there Where I pace in my pen and my friends found friends who care" +
                "No one sees when you lose when you're playing solitaire You should find another guiding light, guiding light" +
                "But I shine so bright You should find another guiding light, guiding light But I shine so bright" +
                "You should find another, you should find another (Guiding light) Find another, you should find another" +
                "You should find another ";
        lyrics[21] = "I washed my hands of us at the club You made a mess of me I pictured you with other girls in love" +
                "Then threw up on the street Like waiting for a bus that never shows You just start walkin' on" +
                "They say that if it's right, you know Each bar plays our song Nothing has ever felt so wrong" +
                "Oh, my, love is a lie Shit my friends say to get me by It hits different It hits different this time" +
                "Catastrophic blues Movin' on was always easy for me to do It hits different It hits different 'cause it's you" +
                "('Cause it's you) I used to switch out these Kens, I'd just ghost Rip the band-aid off and skip town likе an asshole outlaw" +
                "Freedom felt like summеr then on the coast Now the sun burns my heart and the sand hurts my feelings" +
                "And I never don't cry (And I never don't cry) at the bar Yeah, my sadness is contagious (My sadness is contagious)" +
                "I slur your name 'til someone puts me in a car I stopped receiving invitations Oh, my, love is a lie" +
                "Shit my friends say to get me by It hits different It hits different this time Catastrophic blues" +
                "Movin' on was always easy for me to do It hits different It hits different 'cause it's you ('Cause it's you)" +
                "I find the artifacts, cried over a hat Cursed the space that I needed I trace the evidence, make it make some sense" +
                "Why the wound is still bleedin' You were the one that I loved Don't need another metaphor, it's simple enough" +
                "A wrinkle in time like the crease by your eyes This is why they shouldn't kill off the main guy" +
                "Dreams of your hair and your stare and sense of belief In the good in the world, you once believed in me" +
                "And I felt you and I held you for a while Bet I could still melt your world Argumentative, antithetical dream girl" +
                "I heard your key turn in the door down the hallway Is that your key in the door? Is it okay? Is it you?" +
                "Or have they come to take me away? To take me away Oh, my, love is a lie Shit my friends say to get me by" +
                "It hits different (It hits different) It hits different this time Catastrophic blues Movin' on was always easy for me to do" +
                "It hits different (It hits different) It hits different 'cause it's you Oh, my, love is a lie" +
                "Shit my friends say to get me by 'Cause it's you Catastrophic blues Movin' on was always easy for me to do" +
                "It hits different (Yeah) It hits different 'cause it's you ";
        lyrics[22] = "You say, \"I don't understand,\" and I say, \"I know you don't\" We thought a cure would come through in time, now, I fear it won't" +
                "Remember lookin' at this room? We loved it 'cause of the light Now, I just sit in the dark and wonder if it's time" +
                "Do I throw out everything we built or keep it? I'm getting tired even for a phoenix Always risin' from the ashes" +
                "Mendin' all her gashes You might just have dealt the final blow Stop, you're losin' me Stop, you're losin' me" +
                "Stop, you're losin' me I can't find a pulse My heart won't start anymore for you 'Cause you're losin' me" +
                "Every mornin', I glared at you with storms in my eyes How can you say that you love someone you can't tell is dyin'?" +
                "I sent you signals and bit my nails down to the quick My face was gray, but you wouldn't admit that we were sick" +
                "And the air is thick with loss and indecision I know my pain is such an imposition Now, you're runnin' down the hallway" +
                "And you know what they all say \"You don't know what you got until it's gone\" Stop, you're losin' me" +
                "Stop, you're losin' me Stop, you're losin' me I can't find a pulse My heart won't start anymore for you" +
                "'Cause you're losin' me 'Cause you're losin' me Stop (Stop) 'cause you're losin' me My heart won't start anymore" +
                "(Stop 'cause you're losin' me) My heart won't start anymore (Stop 'cause you're losin' me) How long could we be a sad song" +
                "'Til we were too far gone to bring back to life? I gave you all my best me's, my endless empathy" +
                "And all I did was bleed as I tried to be the bravest soldier Fighting in only your army, frontlines, don't you ignore me" +
                "I'm the best thing at this party (You're losin' me) And I wouldn't marry me either A pathological people pleaser" +
                "Who only wanted you to see her And I'm fadin', thinkin' \"Do something, babe, say something\" (Say something)" +
                "\"Lose something, babe, risk something\" (You're losin' me) \"Choose something, babe, I got nothing\" (I got nothing)" +
                "\"To believe, unless you're choosin' me\" You're losin' me Stop (Stop, stop), you're losin' me" +
                "Stop (Stop, stop), you're losin' me I can't find a pulse My heart won't start anymore ";


        //Everything in lowercase
        for(int j = 1; j <= tracksNumber; j++){
            lyrics[j]=lyrics[j].toLowerCase();
        }
    }

    public void search(String str, String[] solution){
        boolean midnightsbool = false;
        for(int i = 1; i<=this.tracksNumber; i++){
            if(this.lyrics[i].contains(str)){
                if(midnightsbool){
                    solution[1]+= ", "+this.titles[i];
                    solution[0]+= ", "+i;
                }else{
                    midnightsbool= true;
                    solution[1]+= this.album+ ": "+this.titles[i];
                    solution[0]+= this.album+ ": "+ i;
                }
            }
        }
        solution[0]+="\n";
        solution[1]+="\n";
    }
}

