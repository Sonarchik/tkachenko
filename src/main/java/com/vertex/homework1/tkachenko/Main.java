package com.vertex.homework1.tkachenko;

public class Main {
    public static void main(String[] args) {

        Teacher wr = new Teacher("I\n" +
                "«Мой дядя самых честных правил,\n" +
                "Когда не в шутку занемог,\n" +
                "Он уважать себя заставил\n" +
                "И лучше выдумать не мог.\n" +
                "Его пример другим наука;\n" +
                "Но, боже мой, какая скука\n" +
                "С больным сидеть и день и ночь,\n" +
                "Не отходя ни шагу прочь!\n" +
                "Какое низкое коварство\n" +
                "Полуживого забавлять,\n" +
                "Ему подушки поправлять,\n" +
                "Печально подносить лекарство,\n" +
                "Вздыхать и думать про себя:\n" +
                "Когда же черт возьмет тебя!»\n" +
                "II\n" +
                "Так думал молодой повеса,\n" +
                "Летя в пыли на почтовых,\n" +
                "Всевышней волею Зевеса\n" +
                "Наследник всех своих родных.\n" +
                "Друзья Людмилы и Руслана!\n" +
                "С героем моего романа\n" +
                "Без предисловий, сей же час\n" +
                "Позвольте познакомить вас:\n" +
                "Онегин, добрый мой приятель,\n" +
                "Родился на брегах Невы,\n" +
                "Где, может быть, родились вы\n" +
                "Или блистали, мой читатель;\n" +
                "Там некогда гулял и я:\n" +
                "Но вреден север для меня 1.\n" +
                "III\n" +
                "Служив отлично благородно,\n" +
                "Долгами жил его отец,\n" +
                "Давал три бала ежегодно\n" +
                "И промотался наконец.\n" +
                "Судьба Евгения хранила:\n" +
                "Сперва Madame за ним ходила,\n" +
                "Потом Monsieur ее сменил.\n" +
                "Ребенок был резов, но мил.\n" +
                "Monsieur l'Abbé, француз убогой,\n" +
                "Чтоб не измучилось дитя,\n" +
                "Учил его всему шутя,\n" +
                "Не докучал моралью строгой,\n" +
                "Слегка за шалости бранил\n" +
                "И в Летний сад гулять водил.\n" +
                "IV\n" +
                "Когда же юности мятежной\n" +
                "Пришла Евгению пора,\n" +
                "Пора надежд и грусти нежной,\n" +
                "Monsieur прогнали со двора.\n" +
                "Вот мой Онегин на свободе;\n" +
                "Острижен по последней моде,\n" +
                "Как dandy 2 лондонский одет —\n" +
                "И наконец увидел свет.\n" +
                "Он по-французски совершенно\n" +
                "Мог изъясняться и писал;\n" +
                "Легко мазурку танцевал\n" +
                "И кланялся непринужденно;\n" +
                "Чего ж вам больше? Свет решил,\n" +
                "Что он умен и очень мил.\n" +
                "V\n" +
                "Мы все учились понемногу\n" +
                "Чему-нибудь и как-нибудь,\n" +
                "Так воспитаньем, слава богу,\n" +
                "У нас немудрено блеснуть.\n" +
                "Онегин был по мненью многих\n" +
                "(Судей решительных и строгих)\n" +
                "Ученый малый, но педант:\n" +
                "Имел он счастливый талант\n" +
                "Без принужденья в разговоре\n" +
                "Коснуться до всего слегка,\n" +
                "С ученым видом знатока\n" +
                "Хранить молчанье в важном споре\n" +
                "И возбуждать улыбку дам\n" +
                "Огнем нежданных эпиграмм.\n" +
                "VI\n" +
                "Латынь из моды вышла ныне:\n" +
                "Так, если правду вам сказать,\n" +
                "Он знал довольно по-латыне,\n" +
                "Чтоб эпиграфы разбирать,\n" +
                "Потолковать об Ювенале,\n" +
                "В конце письма поставить vale,\n" +
                "Да помнил, хоть не без греха,\n" +
                "Из Энеиды два стиха.\n" +
                "Он рыться не имел охоты\n" +
                "В хронологической пыли\n" +
                "Бытописания земли:\n" +
                "Но дней минувших анекдоты\n" +
                "От Ромула до наших дней\n" +
                "Хранил он в памяти своей.\n" +
                "VII\n" +
                "Высокой страсти не имея\n" +
                "Для звуков жизни не щадить,\n" +
                "Не мог он ямба от хорея,\n" +
                "Как мы ни бились, отличить.\n" +
                "Бранил Гомера, Феокрита;\n" +
                "Зато читал Адама Смита\n" +
                "И был глубокой эконом,\n" +
                "То есть умел судить о том,\n" +
                "Как государство богатеет,\n" +
                "И чем живет, и почему\n" +
                "Не нужно золота ему,\n" +
                "Когда простой продукт имеет.\n" +
                "Отец понять его не мог\n" +
                "И земли отдавал в залог.\n" +
                "VIII\n" +
                "Всего, что знал еще Евгений,\n" +
                "Пересказать мне недосуг;\n" +
                "Но в чем он истинный был гений,\n" +
                "Что знал он тверже всех наук,\n" +
                "Что было для него измлада\n" +
                "И труд, и мука, и отрада,\n" +
                "Что занимало целый день\n" +
                "Его тоскующую лень, —\n" +
                "Была наука страсти нежной,\n" +
                "Которую воспел Назон,\n" +
                "За что страдальцем кончил он\n" +
                "Свой век блестящий и мятежный\n" +
                "В Молдавии, в глуши степей,\n" +
                "Вдали Италии своей.\n" +
                "IX\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                "\n" +
                "X\n" +
                "Как рано мог он лицемерить,\n" +
                "Таить надежду, ревновать,\n" +
                "Разуверять, заставить верить,\n" +
                "Казаться мрачным, изнывать,\n" +
                "Являться гордым и послушным,\n" +
                "Внимательным иль равнодушным!\n" +
                "Как томно был он молчалив,\n" +
                "Как пламенно красноречив,\n" +
                "В сердечных письмах как небрежен!\n" +
                "Одним дыша, одно любя,\n" +
                "Как он умел забыть себя!\n" +
                "Как взор его был быстр и нежен,\n" +
                "Стыдлив и дерзок, а порой\n" +
                "Блистал послушною слезой!\n" +
                "XI\n" +
                "Как он умел казаться новым,\n" +
                "Шутя невинность изумлять,\n" +
                "Пугать отчаяньем готовым,\n" +
                "Приятной лестью забавлять,\n" +
                "Ловить минуту умиленья,\n" +
                "Невинных лет предубежденья\n" +
                "Умом и страстью побеждать,\n" +
                "Невольной ласки ожидать,\n" +
                "Молить и требовать признанья,\n" +
                "Подслушать сердца первый звук,\n" +
                "Преследовать любовь, и вдруг\n" +
                "Добиться тайного свиданья...\n" +
                "И после ей наедине\n" +
                "Давать уроки в тишине!\n" +
                "XII\n" +
                "Как рано мог уж он тревожить\n" +
                "Сердца кокеток записных!\n" +
                "Когда ж хотелось уничтожить\n" +
                "Ему соперников своих,\n" +
                "Как он язвительно злословил!\n" +
                "Какие сети им готовил!\n" +
                "Но вы, блаженные мужья,\n" +
                "С ним оставались вы друзья:\n" +
                "Его ласкал супруг лукавый,\n" +
                "Фобласа давний ученик,\n" +
                "И недоверчивый старик,\n" +
                "И рогоносец величавый,\n" +
                "Всегда довольный сам собой,\n" +
                "Своим обедом и женой.\n" +
                "XIII. XIV\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                "\n" +
                "XV\n" +
                "Бывало, он еще в постеле:\n" +
                "К нему записочки несут.\n" +
                "Что? Приглашенья? В самом деле,\n" +
                "Три дома на вечер зовут:\n" +
                "Там будет бал, там детский праздник.\n" +
                "Куда ж поскачет мой проказник?\n" +
                "С кого начнет он? Все равно:\n" +
                "Везде поспеть немудрено.\n" +
                "Покамест в утреннем уборе,\n" +
                "Надев широкий боливар 3,\n" +
                "Онегин едет на бульвар\n" +
                "И там гуляет на просторе,\n" +
                "Пока недремлющий брегет\n" +
                "Не прозвонит ему обед.\n" +
                "XVI\n" +
                "Уж тёмно: в санки он садится.\n" +
                "«Пади, пади!» — раздался крик;\n" +
                "Морозной пылью серебрится\n" +
                "Его бобровый воротник.\n" +
                "К Talon 4 помчался: он уверен,\n" +
                "Что там уж ждет его Каверин.\n" +
                "Вошел: и пробка в потолок,\n" +
                "Вина кометы брызнул ток;\n" +
                "Пред ним roast-beef окровавленный,\n" +
                "И трюфли, роскошь юных лет,\n" +
                "Французской кухни лучший цвет,\n" +
                "И Страсбурга пирог нетленный\n" +
                "Меж сыром лимбургским живым\n" +
                "И ананасом золотым.\n" +
                "XVII\n" +
                "Еще бокалов жажда просит\n" +
                "Залить горячий жир котлет,\n" +
                "Но звон брегета им доносит,\n" +
                "Что новый начался балет.\n" +
                "Театра злой законодатель,\n" +
                "Непостоянный обожатель\n" +
                "Очаровательных актрис,\n" +
                "Почетный гражданин кулис,\n" +
                "Онегин полетел к театру,\n" +
                "Где каждый, вольностью дыша,\n" +
                "Готов охлопать entrechat,\n" +
                "Обшикать Федру, Клеопатру,\n" +
                "Моину вызвать (для того,\n" +
                "Чтоб только слышали его).\n" +
                "XVIII\n" +
                "Волшебный край! там в стары годы,\n" +
                "Сатиры смелый властелин,\n" +
                "Блистал Фонвизин, друг свободы,\n" +
                "И переимчивый Княжнин;\n" +
                "Там Озеров невольны дани\n" +
                "Народных слез, рукоплесканий\n" +
                "С младой Семеновой делил;\n" +
                "Там наш Катенин воскресил\n" +
                "Корнеля гений величавый;\n" +
                "Там вывел колкий Шаховской\n" +
                "Своих комедий шумный рой,\n" +
                "Там и Дидло венчался славой,\n" +
                "Там, там под сению кулис\n" +
                "Младые дни мои неслись.\n" +
                "XIX\n" +
                "Мои богини! что вы? где вы?\n" +
                "Внемлите мой печальный глас:\n" +
                "Всё те же ль вы? другие ль девы,\n" +
                "Сменив, не заменили вас?\n" +
                "Услышу ль вновь я ваши хоры?\n" +
                "Узрю ли русской Терпсихоры\n" +
                "Душой исполненный полет?\n" +
                "Иль взор унылый не найдет\n" +
                "Знакомых лиц на сцене скучной,\n" +
                "И, устремив на чуждый свет\n" +
                "Разочарованный лорнет,\n" +
                "Веселья зритель равнодушный,\n" +
                "Безмолвно буду я зевать\n" +
                "И о былом воспоминать?\n" +
                "XX\n" +
                "Театр уж полон; ложи блещут;\n" +
                "Партер и кресла — все кипит;\n" +
                "В райке нетерпеливо плещут,\n" +
                "И, взвившись, занавес шумит.\n" +
                "Блистательна, полувоздушна,\n" +
                "Смычку волшебному послушна,\n" +
                "Толпою нимф окружена,\n" +
                "Стоит Истомина; она,\n" +
                "Одной ногой касаясь пола,\n" +
                "Другою медленно кружит,\n" +
                "И вдруг прыжок, и вдруг летит,\n" +
                "Летит, как пух от уст Эола;\n" +
                "То стан совьет, то разовьет\n" +
                "И быстрой ножкой ножку бьет.\n" +
                "XXI\n" +
                "Все хлопает. Онегин входит,\n" +
                "Идет меж кресел по ногам,\n" +
                "Двойной лорнет скосясь наводит\n" +
                "На ложи незнакомых дам;\n" +
                "Все ярусы окинул взором,\n" +
                "Всё видел: лицами, убором\n" +
                "Ужасно недоволен он;\n" +
                "С мужчинами со всех сторон\n" +
                "Раскланялся, потом на сцену\n" +
                "В большом рассеянье взглянул,\n" +
                "Отворотился — и зевнул,\n" +
                "И молвил: «Всех пора на смену;\n" +
                "Балеты долго я терпел,\n" +
                "Но и Дидло мне надоел» 5.\n" +
                "XXII\n" +
                "Еще амуры, черти, змеи\n" +
                "На сцене скачут и шумят;\n" +
                "Еще усталые лакеи\n" +
                "На шубах у подъезда спят;\n" +
                "Еще не перестали топать,\n" +
                "Сморкаться, кашлять, шикать, хлопать;\n" +
                "Еще снаружи и внутри\n" +
                "Везде блистают фонари;\n" +
                "Еще, прозябнув, бьются кони,\n" +
                "Наскуча упряжью своей,\n" +
                "И кучера, вокруг огней,\n" +
                "Бранят господ и бьют в ладони —\n" +
                "А уж Онегин вышел вон;\n" +
                "Домой одеться едет он.\n" +
                "XXIII\n" +
                "Изображу ль в картине верной\n" +
                "Уединенный кабинет,\n" +
                "Где мод воспитанник примерный\n" +
                "Одет, раздет и вновь одет?\n" +
                "Все, чем для прихоти обильной\n" +
                "Торгует Лондон щепетильный\n" +
                "И по Балтическим волнам\n" +
                "За лес и сало возит нам,\n" +
                "Все, что в Париже вкус голодный,\n" +
                "Полезный промысел избрав,\n" +
                "Изобретает для забав,\n" +
                "Для роскоши, для неги модной, —\n" +
                "Все украшало кабинет\n" +
                "Философа в осьмнадцать лет.\n" +
                "XXIV\n" +
                "Янтарь на трубках Цареграда,\n" +
                "Фарфор и бронза на столе,\n" +
                "И, чувств изнеженных отрада,\n" +
                "Духи в граненом хрустале;\n" +
                "Гребенки, пилочки стальные,\n" +
                "Прямые ножницы, кривые\n" +
                "И щетки тридцати родов\n" +
                "И для ногтей и для зубов.\n" +
                "Руссо (замечу мимоходом)\n" +
                "Не мог понять, как важный Грим\n" +
                "Смел чистить ногти перед ним,\n" +
                "Красноречивым сумасбродом 6.\n" +
                "Защитник вольности и прав\n" +
                "В сем случае совсем неправ.\n" +
                "XXV\n" +
                "Быть можно дельным человеком\n" +
                "И думать о красе ногтей:\n" +
                "К чему бесплодно спорить с веком?\n" +
                "Обычай деспот меж людей.\n" +
                "Второй Чадаев, мой Евгений,\n" +
                "Боясь ревнивых осуждений,\n" +
                "В своей одежде был педант\n" +
                "И то, что мы назвали франт.\n" +
                "Он три часа по крайней мере\n" +
                "Пред зеркалами проводил\n" +
                "И из уборной выходил\n" +
                "Подобный ветреной Венере,\n" +
                "Когда, надев мужской наряд,\n" +
                "Богиня едет в маскарад.\n" +
                "XXVI\n" +
                "В последнем вкусе туалетом\n" +
                "Заняв ваш любопытный взгляд,\n" +
                "Я мог бы пред ученым светом\n" +
                "Здесь описать его наряд;\n" +
                "Конечно б это было смело,\n" +
                "Описывать мое же дело:\n" +
                "Но панталоны, фрак, жилет,\n" +
                "Всех этих слов на русском нет;\n" +
                "А вижу я, винюсь пред вами,\n" +
                "Что уж и так мой бедный слог\n" +
                "Пестреть гораздо б меньше мог\n" +
                "Иноплеменными словами,\n" +
                "Хоть и заглядывал я встарь\n" +
                "В Академический словарь.\n" +
                "XXVII\n" +
                "У нас теперь не то в предмете:\n" +
                "Мы лучше поспешим на бал,\n" +
                "Куда стремглав в ямской карете\n" +
                "Уж мой Онегин поскакал.\n" +
                "Перед померкшими домами\n" +
                "Вдоль сонной улицы рядами\n" +
                "Двойные фонари карет\n" +
                "Веселый изливают свет\n" +
                "И радуги на снег наводят;\n" +
                "Усеян плошками кругом,\n" +
                "Блестит великолепный дом;\n" +
                "По цельным окнам тени ходят,\n" +
                "Мелькают профили голов\n" +
                "И дам и модных чудаков.\n" +
                "XXVIII\n" +
                "Вот наш герой подъехал к сеням;\n" +
                "Швейцара мимо он стрелой\n" +
                "Взлетел по мраморным ступеням,\n" +
                "Расправил волоса рукой,\n" +
                "Вошел. Полна народу зала;\n" +
                "Музыка уж греметь устала;\n" +
                "Толпа мазуркой занята;\n" +
                "Кругом и шум и теснота;\n" +
                "Бренчат кавалергарда шпоры;\n" +
                "Летают ножки милых дам;\n" +
                "По их пленительным следам\n" +
                "Летают пламенные взоры,\n" +
                "И ревом скрыпок заглушен\n" +
                "Ревнивый шепот модных жен.\n" +
                "XXIX\n" +
                "Во дни веселий и желаний\n" +
                "Я был от балов без ума:\n" +
                "Верней нет места для признаний\n" +
                "И для вручения письма.\n" +
                "О вы, почтенные супруги!\n" +
                "Вам предложу свои услуги;\n" +
                "Прошу мою заметить речь:\n" +
                "Я вас хочу предостеречь.\n" +
                "Вы также, маменьки, построже\n" +
                "За дочерьми смотрите вслед:\n" +
                "Держите прямо свой лорнет!\n" +
                "Не то... не то, избави боже!\n" +
                "Я это потому пишу,\n" +
                "Что уж давно я не грешу.\n" +
                "XXX\n" +
                "Увы, на разные забавы\n" +
                "Я много жизни погубил!\n" +
                "Но если б не страдали нравы,\n" +
                "Я балы б до сих пор любил.\n" +
                "Люблю я бешеную младость,\n" +
                "И тесноту, и блеск, и радость,\n" +
                "И дам обдуманный наряд;\n" +
                "Люблю их ножки; только вряд\n" +
                "Найдете вы в России целой\n" +
                "Три пары стройных женских ног.\n" +
                "Ах! долго я забыть не мог\n" +
                "Две ножки... Грустный, охладелый,\n" +
                "Я всё их помню, и во сне\n" +
                "Они тревожат сердце мне.\n" +
                "XXXI\n" +
                "Когда ж и где, в какой пустыне,\n" +
                "Безумец, их забудешь ты?\n" +
                "Ах, ножки, ножки! где вы ныне?\n" +
                "Где мнете вешние цветы?\n" +
                "Взлелеяны в восточной неге,\n" +
                "На северном, печальном снеге\n" +
                "Вы не оставили следов:\n" +
                "Любили мягких вы ковров\n" +
                "Роскошное прикосновенье.\n" +
                "Давно ль для вас я забывал\n" +
                "И жажду славы и похвал,\n" +
                "И край отцов, и заточенье?\n" +
                "Исчезло счастье юных лет,\n" +
                "Как на лугах ваш легкий след.\n" +
                "XXXII\n" +
                "Дианы грудь, ланиты Флоры\n" +
                "Прелестны, милые друзья!\n" +
                "Однако ножка Терпсихоры\n" +
                "Прелестней чем-то для меня.\n" +
                "Она, пророчествуя взгляду\n" +
                "Неоцененную награду,\n" +
                "Влечет условною красой\n" +
                "Желаний своевольный рой.\n" +
                "Люблю ее, мой друг Эльвина,\n" +
                "Под длинной скатертью столов,\n" +
                "Весной на мураве лугов,\n" +
                "Зимой на чугуне камина,\n" +
                "На зеркальном паркете зал,\n" +
                "У моря на граните скал.\n" +
                "XXXIII\n" +
                "Я помню море пред грозою:\n" +
                "Как я завидовал волнам,\n" +
                "Бегущим бурной чередою\n" +
                "С любовью лечь к ее ногам!\n" +
                "Как я желал тогда с волнами\n" +
                "Коснуться милых ног устами!\n" +
                "Нет, никогда средь пылких дней\n" +
                "Кипящей младости моей\n" +
                "Я не желал с таким мученьем\n" +
                "Лобзать уста младых Армид,\n" +
                "Иль розы пламенных ланит,\n" +
                "Иль перси, полные томленьем;\n" +
                "Нет, никогда порыв страстей\n" +
                "Так не терзал души моей!\n" +
                "XXXIV\n" +
                "Мне памятно другое время!\n" +
                "В заветных иногда мечтах\n" +
                "Держу я счастливое стремя...\n" +
                "И ножку чувствую в руках;\n" +
                "Опять кипит воображенье,\n" +
                "Опять ее прикосновенье\n" +
                "Зажгло в увядшем сердце кровь,\n" +
                "Опять тоска, опять любовь!..\n" +
                "Но полно прославлять надменных\n" +
                "Болтливой лирою своей;\n" +
                "Они не стоят ни страстей,\n" +
                "Ни песен, ими вдохновенных:\n" +
                "Слова и взор волшебниц сих\n" +
                "Обманчивы... как ножки их.\n" +
                "XXXV\n" +
                "Что ж мой Онегин? Полусонный\n" +
                "В постелю с бала едет он:\n" +
                "А Петербург неугомонный\n" +
                "Уж барабаном пробужден.\n" +
                "Встает купец, идет разносчик,\n" +
                "На биржу тянется извозчик,\n" +
                "С кувшином охтенка спешит,\n" +
                "Под ней снег утренний хрустит.\n" +
                "Проснулся утра шум приятный.\n" +
                "Открыты ставни; трубный дым\n" +
                "Столбом восходит голубым,\n" +
                "И хлебник, немец аккуратный,\n" +
                "В бумажном колпаке, не раз\n" +
                "Уж отворял свой васисдас.\n" +
                "XXXVI\n" +
                "Но, шумом бала утомленный\n" +
                "И утро в полночь обратя,\n" +
                "Спокойно спит в тени блаженной\n" +
                "Забав и роскоши дитя.\n" +
                "Проснется за полдень, и снова\n" +
                "До утра жизнь его готова,\n" +
                "Однообразна и пестра.\n" +
                "И завтра то же, что вчера.\n" +
                "Но был ли счастлив мой Евгений,\n" +
                "Свободный, в цвете лучших лет,\n" +
                "Среди блистательных побед,\n" +
                "Среди вседневных наслаждений?\n" +
                "Вотще ли был он средь пиров\n" +
                "Неосторожен и здоров?\n" +
                "XXXVII\n" +
                "Нет: рано чувства в нем остыли;\n" +
                "Ему наскучил света шум;\n" +
                "Красавицы не долго были\n" +
                "Предмет его привычных дум;\n" +
                "Измены утомить успели;\n" +
                "Друзья и дружба надоели,\n" +
                "Затем, что не всегда же мог\n" +
                "Beef-steaks и страсбургский пирог\n" +
                "Шампанской обливать бутылкой\n" +
                "И сыпать острые слова,\n" +
                "Когда болела голова;\n" +
                "И хоть он был повеса пылкой,\n" +
                "Но разлюбил он наконец\n" +
                "И брань, и саблю, и свинец.\n" +
                "XXXVIII\n" +
                "Недуг, которого причину\n" +
                "Давно бы отыскать пора,\n" +
                "Подобный английскому сплину,\n" +
                "Короче: русская хандра\n" +
                "Им овладела понемногу;\n" +
                "Он застрелиться, слава богу,\n" +
                "Попробовать не захотел,\n" +
                "Но к жизни вовсе охладел.\n" +
                "Как Child-Harold, угрюмый, томный\n" +
                "В гостиных появлялся он;\n" +
                "Ни сплетни света, ни бостон,\n" +
                "Ни милый взгляд, ни вздох нескромный,\n" +
                "Ничто не трогало его,\n" +
                "Не замечал он ничего.\n" +
                "XXXIX. XL. XLI\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                " ........................................................\n" +
                "\n" +
                "XLII\n" +
                "Причудницы большого света!\n" +
                "Всех прежде вас оставил он;\n" +
                "И правда то, что в наши лета\n" +
                "Довольно скучен высший тон;\n" +
                "Хоть, может быть, иная дама\n" +
                "Толкует Сея и Бентама,\n" +
                "Но вообще их разговор\n" +
                "Несносный, хоть невинный вздор;\n" +
                "К тому ж они так непорочны,\n" +
                "Так величавы, так умны,\n" +
                "Так благочестия полны,\n" +
                "Так осмотрительны, так точны,\n" +
                "Так неприступны для мужчин,\n" +
                "Что вид их уж рождает сплин 7.\n" +
                "XLIII\n" +
                "И вы, красотки молодые,\n" +
                "Которых позднею порой\n" +
                "Уносят дрожки удалые\n" +
                "По петербургской мостовой,\n" +
                "И вас покинул мой Евгений.\n" +
                "Отступник бурных наслаждений,\n" +
                "Онегин дома заперся,\n" +
                "Зевая, за перо взялся,\n" +
                "Хотел писать — но труд упорный\n" +
                "Ему был тошен; ничего\n" +
                "Не вышло из пера его,\n" +
                "И не попал он в цех задорный\n" +
                "Людей, о коих не сужу,\n" +
                "Затем, что к ним принадлежу.\n" +
                "XLIV\n" +
                "И снова, преданный безделью,\n" +
                "Томясь душевной пустотой,\n" +
                "Уселся он — с похвальной целью\n" +
                "Себе присвоить ум чужой;\n" +
                "Отрядом книг уставил полку,\n" +
                "Читал, читал, а всё без толку:\n" +
                "Там скука, там обман иль бред;\n" +
                "В том совести, в том смысла нет;\n" +
                "На всех различные вериги;\n" +
                "И устарела старина,\n" +
                "И старым бредит новизна.\n" +
                "Как женщин, он оставил книги,\n" +
                "И полку, с пыльной их семьей,\n" +
                "Задернул траурной тафтой.\n" +
                "XLV\n" +
                "Условий света свергнув бремя,\n" +
                "Как он, отстав от суеты,\n" +
                "С ним подружился я в то время.\n" +
                "Мне нравились его черты,\n" +
                "Мечтам невольная преданность,\n" +
                "Неподражательная странность\n" +
                "И резкий, охлажденный ум.\n" +
                "Я был озлоблен, он угрюм;\n" +
                "Страстей игру мы знали оба;\n" +
                "Томила жизнь обоих нас;\n" +
                "В обоих сердца жар угас;\n" +
                "Обоих ожидала злоба\n" +
                "Слепой Фортуны и людей\n" +
                "На самом утре наших дней.\n" +
                "XLVI\n" +
                "Кто жил и мыслил, тот не может\n" +
                "В душе не презирать людей;\n" +
                "Кто чувствовал, того тревожит\n" +
                "Призрак невозвратимых дней:\n" +
                "Тому уж нет очарований,\n" +
                "Того змия воспоминаний,\n" +
                "Того раскаянье грызет.\n" +
                "Все это часто придает\n" +
                "Большую прелесть разговору.\n" +
                "Сперва Онегина язык\n" +
                "Меня смущал; но я привык\n" +
                "К его язвительному спору,\n" +
                "И к шутке, с желчью пополам,\n" +
                "И злости мрачных эпиграмм.\n" +
                "XLVII\n" +
                "Как часто летнею порою,\n" +
                "Когда прозрачно и светло\n" +
                "Ночное небо над Невою 8\n" +
                "И вод веселое стекло\n" +
                "Не отражает лик Дианы,\n" +
                "Воспомня прежних лет романы,\n" +
                "Воспомня прежнюю любовь,\n" +
                "Чувствительны, беспечны вновь,\n" +
                "Дыханьем ночи благосклонной\n" +
                "Безмолвно упивались мы!\n" +
                "Как в лес зеленый из тюрьмы\n" +
                "Перенесен колодник сонный,\n" +
                "Так уносились мы мечтой\n" +
                "К началу жизни молодой.\n" +
                "XLVIII\n" +
                "С душою, полной сожалений,\n" +
                "И опершися на гранит,\n" +
                "Стоял задумчиво Евгений,\n" +
                "Как описал себя пиит 9.\n" +
                "Все было тихо; лишь ночные\n" +
                "Перекликались часовые,\n" +
                "Да дрожек отдаленный стук\n" +
                "С Мильонной раздавался вдруг;\n" +
                "Лишь лодка, веслами махая,\n" +
                "Плыла по дремлющей реке:\n" +
                "И нас пленяли вдалеке\n" +
                "Рожок и песня удалая...\n" +
                "Но слаще, средь ночных забав,\n" +
                "Напев Торкватовых октав!\n" +
                "XLIX\n" +
                "Адриатические волны,\n" +
                "О Брента! нет, увижу вас\n" +
                "И, вдохновенья снова полный,\n" +
                "Услышу ваш волшебный глас!\n" +
                "Он свят для внуков Аполлона;\n" +
                "По гордой лире Альбиона\n" +
                "Он мне знаком, он мне родной.\n" +
                "Ночей Италии златой\n" +
                "Я негой наслажусь на воле,\n" +
                "С венецианкою младой,\n" +
                "То говорливой, то немой,\n" +
                "Плывя в таинственной гондоле;\n" +
                "С ней обретут уста мои\n" +
                "Язык Петрарки и любви.\n" +
                "L\n" +
                "Придет ли час моей свободы?\n" +
                "Пора, пора! — взываю к ней;\n" +
                "Брожу над морем 10, жду погоды,\n" +
                "Маню ветрила кораблей.\n" +
                "Под ризой бурь, с волнами споря,\n" +
                "По вольному распутью моря\n" +
                "Когда ж начну я вольный бег?\n" +
                "Пора покинуть скучный брег\n" +
                "Мне неприязненной стихии\n" +
                "И средь полуденных зыбей,\n" +
                "Под небом Африки моей 11,\n" +
                "Вздыхать о сумрачной России,\n" +
                "Где я страдал, где я любил,\n" +
                "Где сердце я похоронил.\n" +
                "LI\n" +
                "Онегин был готов со мною\n" +
                "Увидеть чуждые страны;\n" +
                "Но скоро были мы судьбою\n" +
                "На долгой срок разведены.\n" +
                "Отец его тогда скончался.\n" +
                "Перед Онегиным собрался\n" +
                "Заимодавцев жадный полк.\n" +
                "У каждого свой ум и толк:\n" +
                "Евгений, тяжбы ненавидя,\n" +
                "Довольный жребием своим,\n" +
                "Наследство предоставил им,\n" +
                "Большой потери в том не видя\n" +
                "Иль предузнав издалека\n" +
                "Кончину дяди старика.\n" +
                "LII\n" +
                "Вдруг получил он в самом деле\n" +
                "От управителя доклад,\n" +
                "Что дядя при смерти в постеле\n" +
                "И с ним проститься был бы рад.\n" +
                "Прочтя печальное посланье,\n" +
                "Евгений тотчас на свиданье\n" +
                "Стремглав по почте поскакал\n" +
                "И уж заранее зевал,\n" +
                "Приготовляясь, денег ради,\n" +
                "На вздохи, скуку и обман\n" +
                "(И тем я начал мой роман);\n" +
                "Но, прилетев в деревню дяди,\n" +
                "Его нашел уж на столе,\n" +
                "Как дань готовую земле.\n" +
                "LIII\n" +
                "Нашел он полон двор услуги;\n" +
                "К покойнику со всех сторон\n" +
                "Съезжались недруги и други,\n" +
                "Охотники до похорон.\n" +
                "Покойника похоронили.\n" +
                "Попы и гости ели, пили\n" +
                "И после важно разошлись,\n" +
                "Как будто делом занялись.\n" +
                "Вот наш Онегин — сельский житель,\n" +
                "Заводов, вод, лесов, земель\n" +
                "Хозяин полный, а досель\n" +
                "Порядка враг и расточитель,\n" +
                "И очень рад, что прежний путь\n" +
                "Переменил на что-нибудь.\n" +
                "LIV\n" +
                "Два дня ему казались новы\n" +
                "Уединенные поля,\n" +
                "Прохлада сумрачной дубровы,\n" +
                "Журчанье тихого ручья;\n" +
                "На третий роща, холм и поле\n" +
                "Его не занимали боле;\n" +
                "Потом уж наводили сон;\n" +
                "Потом увидел ясно он,\n" +
                "Что и в деревне скука та же,\n" +
                "Хоть нет ни улиц, ни дворцов,\n" +
                "Ни карт, ни балов, ни стихов.\n" +
                "Хандра ждала его на страже,\n" +
                "И бегала за ним она,\n" +
                "Как тень иль верная жена.\n" +
                "LV\n" +
                "Я был рожден для жизни мирной,\n" +
                "Для деревенской тишины;\n" +
                "В глуши звучнее голос лирный,\n" +
                "Живее творческие сны.\n" +
                "Досугам посвятясь невинным,\n" +
                "Брожу над озером пустынным,\n" +
                "И far niente мой закон.\n" +
                "Я каждым утром пробужден\n" +
                "Для сладкой неги и свободы:\n" +
                "Читаю мало, долго сплю,\n" +
                "Летучей славы не ловлю.\n" +
                "Не так ли я в былые годы\n" +
                "Провел в бездействии, в тени\n" +
                "Мои счастливейшие дни?\n" +
                "LVI\n" +
                "Цветы, любовь, деревня, праздность,\n" +
                "Поля! я предан вам душой.\n" +
                "Всегда я рад заметить разность\n" +
                "Между Онегиным и мной,\n" +
                "Чтобы насмешливый читатель\n" +
                "Или какой-нибудь издатель\n" +
                "Замысловатой клеветы,\n" +
                "Сличая здесь мои черты,\n" +
                "Не повторял потом безбожно,\n" +
                "Что намарал я свой портрет,\n" +
                "Как Байрон, гордости поэт,\n" +
                "Как будто нам уж невозможно\n" +
                "Писать поэмы о другом,\n" +
                "Как только о себе самом.\n" +
                "LVII\n" +
                "Замечу кстати: все поэты —\n" +
                "Любви мечтательной друзья.\n" +
                "Бывало, милые предметы\n" +
                "Мне снились, и душа моя\n" +
                "Их образ тайный сохранила;\n" +
                "Их после муза оживила:\n" +
                "Так я, беспечен, воспевал\n" +
                "И деву гор, мой идеал,\n" +
                "И пленниц берегов Салгира.\n" +
                "Теперь от вас, мои друзья,\n" +
                "Вопрос нередко слышу я:\n" +
                "«О ком твоя вздыхает лира?\n" +
                "Кому, в толпе ревнивых дев,\n" +
                "Ты посвятил ее напев?\n" +
                "LVIII\n" +
                "Чей взор, волнуя вдохновенье,\n" +
                "Умильной лаской наградил\n" +
                "Твое задумчивое пенье?\n" +
                "Кого твой стих боготворил?»\n" +
                "И, други, никого, ей-богу!\n" +
                "Любви безумную тревогу\n" +
                "Я безотрадно испытал.\n" +
                "Блажен, кто с нею сочетал\n" +
                "Горячку рифм: он тем удвоил\n" +
                "Поэзии священный бред,\n" +
                "Петрарке шествуя вослед,\n" +
                "А муки сердца успокоил,\n" +
                "Поймал и славу между тем;\n" +
                "Но я, любя, был глуп и нем.\n" +
                "LIX\n" +
                "Прошла любовь, явилась муза,\n" +
                "И прояснился темный ум.\n" +
                "Свободен, вновь ищу союза\n" +
                "Волшебных звуков, чувств и дум;\n" +
                "Пишу, и сердце не тоскует,\n" +
                "Перо, забывшись, не рисует,\n" +
                "Близ неоконченных стихов,\n" +
                "Ни женских ножек, ни голов;\n" +
                "Погасший пепел уж не вспыхнет,\n" +
                "Я всё грущу; но слез уж нет,\n" +
                "И скоро, скоро бури след\n" +
                "В душе моей совсем утихнет:\n" +
                "Тогда-то я начну писать\n" +
                "Поэму песен в двадцать пять.\n" +
                "LX\n" +
                "Я думал уж о форме плана\n" +
                "И как героя назову;\n" +
                "Покамест моего романа\n" +
                "Я кончил первую главу;\n" +
                "Пересмотрел все это строго:\n" +
                "Противоречий очень много,\n" +
                "Но их исправить не хочу.\n" +
                "Цензуре долг свой заплачу\n" +
                "И журналистам на съеденье\n" +
                "Плоды трудов моих отдам:\n" +
                "Иди же к невским берегам,\n" +
                "Новорожденное творенье,\n" +
                "И заслужи мне славы дань:\n" +
                "Кривые толки, шум и брань! ");

        System.out.println(wr);
    }
}
