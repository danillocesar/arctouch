import { TmdpAppPage } from './app.po';

describe('tmdp-app App', function() {
  let page: TmdpAppPage;

  beforeEach(() => {
    page = new TmdpAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
