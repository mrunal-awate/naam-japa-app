import type { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'online.naamjapa.app',
  appName: 'Radha Naam Jap',
  webDir: 'www',
  server: {
    // This makes the app load your real, live website directly.
    // No need to rebuild the app when you update the website content.
    url: 'https://www.naamjapa.online',
    androidScheme: 'https'
  }
};

export default config;
