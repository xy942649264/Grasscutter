package emu.grasscutter.game.quest.content;

import static emu.grasscutter.game.quest.enums.QuestContent.QUEST_CONTENT_KILL_MONSTER;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValueContent;

@QuestValueContent(QUEST_CONTENT_KILL_MONSTER)
public class ContentKillMonster extends BaseContent {
    @Override
    public boolean execute(
            GameQuest quest, QuestData.QuestContentCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0];
    }
}