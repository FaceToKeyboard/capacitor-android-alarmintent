import { registerPlugin } from '@capacitor/core';

import type { AndroidAlarmIntentPlugin } from './definitions';

const AndroidAlarmIntent = registerPlugin<AndroidAlarmIntentPlugin>('AndroidAlarmIntent', {
  web: () => import('./web').then(m => new m.AndroidAlarmIntentWeb()),
});

export * from './definitions';
export { AndroidAlarmIntent };
